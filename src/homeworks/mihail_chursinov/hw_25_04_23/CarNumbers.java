package homeworks.mihail_chursinov.hw_25_04_23;

import java.util.regex.Pattern;

public class CarNumbers {
    public static void main(String[] args) {
        String text = "A356KM";
        String regex = "[ABCEHKMOPTXY]\\d{3}[ABCEHKMOPTXY]{2}";
        System.out.println(Pattern.matches(regex, text));
    }
}
