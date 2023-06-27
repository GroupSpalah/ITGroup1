package homeworks.mihail_chursinov.hw_06_23.hw_23_06_23.task2;
/**
 * format
 * - minus
 * -  3 метода now
 * -  parse
 * -  plus
 * -  of
 * -  until
 * -  isAfter
 * -  isBefore
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MethodLocalDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        Period period = Period.ofDays(2);
        LocalDate subtractedDate = currentDate.minus(period);
        System.out.println("Subtracted date: " + subtractedDate);

        LocalDate currentDateDefaultZone = LocalDate.now();
        System.out.println("Current date in default time zone: " + currentDateDefaultZone);

        ZoneId newYorkZone = ZoneId.of("America/New_York");
        LocalDate currentDateNewYork = LocalDate.now(newYorkZone);
        System.out.println("Current date in New York: " + currentDateNewYork);

        ZoneId londonZone = ZoneId.of("Europe/London");
        LocalDate currentDateLondon = LocalDate.now(londonZone);
        System.out.println("Current date in London: " + currentDateLondon);

        String dateString = "2023-06-15";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed date: " + parsedDate);

        Period periodToAdd = Period.ofMonths(3);
        LocalDate addedDate = currentDate.plus(periodToAdd);
        System.out.println("Added date: " + addedDate);

        LocalDate specificDate = LocalDate.of(2023, 6, 30);
        System.out.println("Specific date: " + specificDate);

        LocalDate startDate = LocalDate.of(2023, 6, 15);
        LocalDate endDate = LocalDate.of(2023, 6, 30);
        long daysBetween = startDate.until(endDate, ChronoUnit.DAYS);
        System.out.println("Days between start and end date: " + daysBetween);

        LocalDate date1 = LocalDate.of(2023, 6, 15);
        LocalDate date2 = LocalDate.of(2023, 6, 30);

        boolean isAfter = date1.isAfter(date2);
        System.out.println("Is date1 after date2? " + isAfter);

        LocalDate date4 = LocalDate.of(2023, 6, 15);
        LocalDate date5 = LocalDate.of(2023, 6, 30);

        boolean isBefore = date4.isBefore(date5);
        System.out.println("Is date1 before date2? " + isBefore);
    }


}
