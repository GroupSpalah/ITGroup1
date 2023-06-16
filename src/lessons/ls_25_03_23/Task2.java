package lessons.ls_25_03_23;

/**
 * *** Ask user to enter two words. Print first word without its first character
 *     then print the second word without its first character.
 *             Input:
 *                 apple
 *                 banana
 *
 *             Output:
 *                 ppleanana
 */
public class Task2 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        String substring1 = str1.substring(1);//pple
        String substring2 = str2.substring(1);//anana

//        String result = substring1 + substring2;
        String result = substring1.concat(substring2);

        System.out.println(result);
    }
}
