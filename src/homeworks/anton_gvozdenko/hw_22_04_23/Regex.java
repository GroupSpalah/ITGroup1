package homeworks.anton_gvozdenko.hw_22_04_23;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "World22";
        String regex = "[A-Za-z]{4}[c-d][1-9]{2}";
        System.out.println(Pattern.matches(regex, text));


        String text1 = "22World";
        String regex1 = "[1-5]{2}[W-Z]*[a-z]{4}";
        System.out.println(Pattern.matches(regex1, text1));

        String text2 = "1235aBcD";
        String regex2 = "[1-9]{4}[^4][.]*[A-Z]+[a-c]+[A-E]*";
        System.out.println(Pattern.matches(regex2, text2));

        String text3 = "zXYC8864";
        String regex3 = "[a-z]+[C-Z]{3}8*[1-9]{2}";
        System.out.println(Pattern.matches(regex3, text3));

        String text4 = "AnTon GvOZdenKo";
        String regex4 = "[A-Z]*[a-z]{4}\sG+[a-b]{8}";
        System.out.println(Pattern.matches(regex4, text4));
    }
}