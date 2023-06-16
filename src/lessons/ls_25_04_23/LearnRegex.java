package lessons.ls_25_04_23;

import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        String str = "(067)";

        String regex = "\\(067\\)";

        System.out.println(Pattern.matches(regex, str));
    }
}
