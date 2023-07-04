package homeworks.anton_gvozdenko.hw_20_06_23.day;


import java.time.LocalDateTime;

public class Day {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now().plusYears(1);
        int dayOfWeek = date.getDayOfWeek().getValue();
        System.out.println("Date is " + date);
        System.out.println("Day of week is " + dayOfWeek);

    }
}
