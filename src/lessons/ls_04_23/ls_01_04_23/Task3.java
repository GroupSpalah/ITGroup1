package lessons.ls_04_23.ls_01_04_23;

/**
 * Соединить две строки след. вида: ("abc", "drf") результат: ("adbrcf"), ("ab", "drf") результат: ("adbrf"),
 * ("abc", "dr") результат: ("adbrc")
 */
public class Task3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "dr";//adbr f -> adbrf

        int length1 = str1.length();
        int length2 = str2.length();

        int diff = Math.abs(length1 - length2);//1

        StringBuilder builder1 = new StringBuilder(str1);

        builder1 = length1 > length2 ? new StringBuilder(str2) : builder1;

        /*if (length1 > length2) {
            builder1 = new StringBuilder(str2);
        }     */

        for (int i = 0; i < diff; i++) {
            builder1.append(" ");//"ab "
        }

        if (length1 > length2) {
            str2 = builder1.toString();
        } else {
            str1 = builder1.toString();
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            builder
                    .append(str1.charAt(i))
                    .append(str2.charAt(i));
        }

        String result = builder.toString().replaceAll(" ", "");

        System.out.println(result);
    }
}
