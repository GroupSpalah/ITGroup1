package lessons.ls_23_06_23;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class LearnDates {
    public static void main(String[] args) {
        Date date = new Date();

//        System.out.println(date);

        Calendar calendar = Calendar.getInstance();

      /*  System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());*/

        LocalDate date1 = LocalDate.now();

        LocalDate date2 = date1.plusDays(10);

//        System.out.println(date2);

        LocalDate date3 = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());


    }
}
