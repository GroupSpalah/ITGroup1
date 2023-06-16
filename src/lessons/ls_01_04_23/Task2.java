package lessons.ls_01_04_23;

/**
 * Имеется строка, к примеру "Hello my young dog".
 * Необходимо перевернуть строку в след. формате "godgn uo yymol leH".
 * То есть после реверса длина слова равнялась изначальной длине.
 */
public class Task2 {
    public static void main(String[] args) {

//        print();

        String str = "Hello my young dog";

        String replacedStr = str.replaceAll(" ", "");//Hellomyyoungdog

        StringBuilder reverseStr = new StringBuilder(replacedStr).reverse();

        String s = reverseStr.toString();//godgnuoyymolleH

        String[] words = str.split(" ");//{"Hello", "my", "young", "dog"}

        StringBuilder builder = new StringBuilder();//"godgn uo "

        for (String word : words) {
            int length = word.length();//2
            String value = s.substring(0, length);//godgn

            builder.append(value).append(" ");
            s = s.substring(length);//uoyymolleH
        }

        System.out.println(builder);
    }

    public static void print() {
        for (int i = 0; i < 500; i++) {
            System.out.println(i);
        }
    }


}
