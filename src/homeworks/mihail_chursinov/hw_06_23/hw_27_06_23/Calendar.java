package homeworks.mihail_chursinov.hw_06_23.hw_27_06_23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * 1) Организовать приложение календарь.
 * Приложение должно позволять:
 * 1) Выводить события на конкретную дату.
 * 2) Создавать событие на конкретную дату. Добавить возможность удалять события.
 * 3) Позволять пользователю вводить свой город(страну/город), определить его тайм-зону и
 * выводить текущее время, день недели в этой тайм-зоне.
 * 4) Выводить в консоль дату через неделю, месяц, год от сегодняшнего дня.
 * 5) Выводить в консоль количество дней оставшеееся до Нового Года.
 * 6) Позволить пользователю вводить формат даты и выводить дату в этом формате.
 */

public class Calendar {
    private String date;
    private String[] events = {"New Year", "Christmas"};

    public void outputEvent(String date) {
        LocalDate parsedDate = LocalDate.parse(date);
        if (date.equals("2023-12-31")) {
            System.out.println(events[0] + "\t" + parsedDate);
        } else if (date.equals("2023-12-25")) {
            System.out.println(events[1] + "\t" + parsedDate);
        } else {
            System.out.println("Wrong date!");
        }
    }

    public void addEvent(String date, String event) {
        String[] newEvents = new String[events.length + 1];
        System.arraycopy(events, 0, newEvents, 0, events.length);
        newEvents[events.length] = event;
        events = newEvents;

        LocalDate parsedDate = LocalDate.parse(date);
        if (date.equals("2023-11-21")) {
            System.out.println(newEvents[2] + "\t" + parsedDate);
        } else {
            System.out.println("Wrong date!");
        }
    }

    public void printTimeZoneId(String city) {
        ZoneId zoneId = ZoneId.of(city);
        LocalDateTime dateTime = LocalDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        String dayOfWeek = String.valueOf(dateTime.getDayOfWeek());

        System.out.println("Current time and day of the week in the city " + city + ":");
        System.out.println("Date & time: " + formattedDateTime);
        System.out.println("Day of the week: " + dayOfWeek);
    }

    public void showMinusDate(String date) {
        LocalDate currentDate = LocalDate.now();
        Period periodOfDays = Period.ofDays(14);
        Period periodOfMonth = Period.ofMonths(1);
        Period periodOfYear = Period.ofYears(1);
        LocalDate subtractedDateOfDays = currentDate.minus(periodOfDays);
        LocalDate subtractedDateOfMonth = currentDate.minus(periodOfMonth);
        LocalDate subtractedDateOfYear = currentDate.minus(periodOfYear);
        System.out.println("Taking into account minus 14 days: " + subtractedDateOfDays);
        System.out.println("Taking into account minus 1 month: " + subtractedDateOfMonth);
        System.out.println("Taking into account minus 1 year: " + subtractedDateOfYear);
    }

    public void amountDaysToNewYear() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        long daysBetween = startDate.until(endDate, ChronoUnit.DAYS);
        System.out.println("The number of days left until the new year: " + daysBetween);
    }

    public void outputFormatOfDate(String date) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(date);
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }

}