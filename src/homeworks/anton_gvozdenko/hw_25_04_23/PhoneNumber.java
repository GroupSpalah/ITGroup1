package homeworks.anton_gvozdenko.hw_25_04_23;

import java.util.regex.Pattern;

public class PhoneNumber {
    String regex = "\\(095\\)|\\(073\\)|\\(067\\)|\\(099\\)|\\(063\\)|\\(097\\)[1-9]{3}\s[0-9]{2}\s[1-9]{2}";

    public void getNumber(String number) {
        if (Pattern.matches(regex, number) && number.startsWith("(097)") || number.startsWith("(067)")) {
            System.out.println("User has a Kievstar number");
        }
        if (Pattern.matches(regex, number) && number.startsWith("(095)") || number.startsWith("(099)")) {
            System.out.println("User has a MTS number");
        }
        if (Pattern.matches(regex, number) && number.startsWith("(063)") || number.startsWith("(073)")) {
            System.out.println("User has a Life number");

        }
    }
    public static void main(String[] args) {
        PhoneNumber numb = new PhoneNumber();
        numb.getNumber("(067)222 33 44");
        numb.getNumber("(099)123 11 11");
        numb.getNumber("(073)555 66 77");
    }
}
