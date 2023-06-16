package homeworks.anton_gvozdenko.hw_25_04_23;

import java.util.regex.Pattern;

public class CarNumber {

    String regex = "[ABCEHKMOPTXY][0-9]{3}[ABCEHKMOPTXY]{2}";

    public void getNumber(String number) {
        if (Pattern.matches(regex, number)) {
            System.out.println("Correct  number");
        } else {
            System.out.println("Number is not correct");
        }
    }

    public static void main(String[] args) {
        CarNumber number = new CarNumber();
        number.getNumber("P204BT");
        number.getNumber("X182YZ");
        number.getNumber("ABC216");

    }
}
