package lessons.ls_21_03_23;

public class LearnString {
    public static void main(String[] args) {
        char symbol = 'H';

        final char[] sentence = {'H', 'e', 'l', 'l', 'o'};
      //  sentence = new char[]{'H', 'l', 'l', 'o'};

        String str1 = "Hello";//object-literal
        String str2 = new String("Hello");//object
        String str3 = "Hello";//object-literal

//        str2 = str1;

        char s1 = str1.charAt(2);

//        System.out.println(s1);

        String substring1 = str1.substring(3);
        String substring2 = str1.substring(2, 4);

        /*System.out.println(str1);
        System.out.println(substring1);
        System.out.println(substring2);*/

        int indexO = str1.indexOf('o');

//        System.out.println(indexO);

        for (int i = 0; i < str1.length(); i++) {
//            System.out.println(str1.charAt(i));
        }

        String sent = "Hello my young friend";

        String[] words = sent.split(" ");

        for (String word : words) {
//            System.out.println(word.toUpperCase());
        }

        System.out.println(str1 == str3);
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
    }
}
