package homeworks.mihail_chursinov.hw_04_23.hw_22_04_23;

import java.util.regex.Pattern;

/**
 * 2) 2-4 цифры, а потом 2-4 буквы и наоборот. - 2 regex
 */

public class RegexTask2 {
    public static void main(String[] args) {
//        String text = "1234True";
//        String regex = "\\d{2,4}[A-Za-z]{2,4}";

        String text = "True1234";
        String regex = "[A-Za-z]{2,4}\\d{2,4}";
        System.out.println(Pattern.matches(regex, text));
    }
}
