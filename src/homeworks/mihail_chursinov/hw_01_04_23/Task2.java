package homeworks.mihail_chursinov.hw_01_04_23;

public class Task2 {
    /**
     * Declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat”
     * for second.
     * Write code to display all of the letters, which are present in the first word, but absent in the second. example lessons.ls_25_03_23.Task1
     */
    public static void main(String[] args) {
        hasNoneChair();
        //Crn

    }

    public static void hasNoneChair() {
        String str1 = "Cartoon";
        String str2 = "Tomcat";

        for (int i = 0; i < str1.length(); i++) {
            char symbol = str1.charAt(i);

            String symbolAsString = String.valueOf(symbol);

            if (!str2.contains(symbolAsString)) {
                System.out.print(str1.charAt(i));
            }
        }
    }
}
