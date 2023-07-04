package homeworks.mihail_chursinov.hw_06_23.hw_27_06_23;

import java.time.LocalDate;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.outputEvent("2023-12-31");
        calendar.addEvent("2023-11-21", "Birthday");
        calendar.printTimeZoneId("Europe/Kiev");
        calendar.showMinusDate("2023-07-04");
        calendar.amountDaysToNewYear();
        calendar.outputFormatOfDate("dd/MM/yyyy");
    }
}
