package homeworks.mihail_chursinov.hw_06_23.hw_23_06_23.task2;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * - atZone
 * - atOffset
 * - from
 * -  truncatedTo
 * -  range
 */

public class MethodLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zone);
        System.out.println("Zoned date and time: " + zonedDateTime);

        ZoneOffset offset = ZoneOffset.ofHours(-10);
        OffsetDateTime offsetDateTime = localDateTime.atOffset(offset);
        System.out.println("Offset date and time: " + offsetDateTime);

//        LocalDate localDate = LocalDate.of(2023, 6, 30);//???
//        LocalDateTime localDateTime1 = LocalDateTime.from(localDate);
//        System.out.println("Local date and time: " + localDateTime1);

        LocalDateTime truncatedDateTime = localDateTime.truncatedTo(ChronoUnit.HOURS);
        System.out.println("Truncated date and time: " + truncatedDateTime);

    }
}


