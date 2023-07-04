package homeworks.anton_gvozdenko.hw_27_06_23;

import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        EventService eventService = new EventService(3);
        Event event = new Event("Easter", "04.05.23");
        Event eventTwo = new Event("BirthDay", "02.03.23");

        System.out.println(event);

        eventService.addEvent(event);
        eventService.addEvent(eventTwo);
        eventService.showEvent("04.05.23");
        eventService.showEvent("02.03.23");
        eventService.addEvent(new Event("New year", "01.01.23"));
        eventService.showEvent("01.01.23");
        eventService.showTimeZone("Europe/Madrid");
        eventService.showFutureDate(Calendar.YEAR, 2);
        eventService.showDaysToNewYear();
        eventService.formatDate("dd-MM-yy");


    }

}
