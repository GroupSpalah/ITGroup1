package homeworks.mihail_chursinov.hw_04_23.hw_22_04_23;

import java.util.regex.Pattern;

/**
 * 1) Любое количество букв, а потом две цифры и наоборот. - 2 regex
 */

public class RegexTask1 {
    public static void main(String[] args) {
//        String text = "Hello23";
//        String regex = "[a-zA-Z]+\\d{2}";

        String text = "235687Hi";
        String regex = "\\d+[a-zA-Z]{2}";
        System.out.println(Pattern.matches(regex, text));

    }

}
