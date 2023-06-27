package homeworks.mihail_chursinov.hw_06_23.hw_23_06_23.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MethodCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Updated date: " + calendar.getTime());

        TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
        Calendar calendar1 = Calendar.getInstance(timeZone);
        Date date = calendar1.getTime();//use object Date!
        System.out.println("Calendar with timezone: " + date);

        TimeZone timeZone1 = calendar.getTimeZone();
        System.out.println("Time zone: " + timeZone1.getID());

        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println("Updated date: " + calendar.getTime());

    }

}
