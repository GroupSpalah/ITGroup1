package lessons.ls_28_03_23;

/**
 * Assume that email address is constructed by person's first name and followed by an underscore and last name.
 *
 *     Write a program that can swap first name with last name in the email (Saperated by an underscore).
 *     If the email doesn't contain an underscore print the given input email.
 *
 *         Ex:
 *             input: mike_tyson@gmail.com
 *             output: tyson_mike@gmail.com
 */
public class Task2 {
    public static void main(String[] args) {
        String email = "mike_tyson@gmail.com";

        String[] words1 = email.split("@");//0 - "mike_tyson", 1 - "gmail.com"

        String[] words2 = words1[0].split("_");//0 - "mike", 1 - "tyson"

        String result = words2[1]
                .concat("_")
                .concat(words2[0])
                .concat("@")
                .concat(words1[1]);

        System.out.println(result);

    }
}
