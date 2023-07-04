package homeworks.anton_gvozdenko.hw_27_06_23;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import static java.util.Calendar.*;

public class EventService {
    private Event[] events;

    public EventService(int size) {
        events = new Event[size];
    }

    public void addEvent(Event event) {
        for (int i = 0; i < events.length; i++) {
            if (Objects.isNull(events[i])) {
                events[i] = event;
                break;
            }
        }
    }

    public void showEvent(String date) {
        for (Event event : events) {
            if (Objects.nonNull(event) &&
                    (event.getDate().equals(date))) {
                event.view();
            }
        }
    }

    public void showTimeZone(String city) {
        ZoneId zone = ZoneId.of(city);
        ZonedDateTime zoneTime = ZonedDateTime.now(zone);
        int dayOfWeek = LocalDate.now(zone).getDayOfWeek().getValue();
        System.out.println(zoneTime);
        System.out.println(dayOfWeek);
    }

    public void showFutureDate(int time, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.getTime();
        calendar.add(time, amount);
        System.out.println(calendar.getTime());
    }

    public void showDaysToNewYear() {
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        Period period = lastDay.until(LocalDate.now());
        System.out.println(period);
    }

    public void formatDate(String formatter) {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern(formatter));
        System.out.println(format);
    }
}












