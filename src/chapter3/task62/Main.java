package javalang.chapter3.task62;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        //Converting String to Instant
        Instant timestampFromString = Instant.parse("2019-02-24T14:31:33.197021300Z");

        //Adding or subtracting time to from Instant
        Instant twoHourLater = Instant.now().plus(2, ChronoUnit.HOURS);
        Instant tenMinutesEarlier = Instant.now().minus(10, ChronoUnit.MINUTES);

        //Comparing Instant objects
        Instant timestamp1 = Instant.now();
        Instant timestamp2 = timestamp1.plusSeconds(10);

        boolean isAfter = timestamp1.isAfter(timestamp2); // false
        boolean isBefore = timestamp1.isBefore(timestamp2); // true

        // 10 seconds
        long difference = timestamp1.until(timestamp2, ChronoUnit.SECONDS);


        //Converting between Instant and LocalDateTime, ZonedDateTime, and OffsetDateTime
        // 2019-02-24T15:27:13.990103700
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        // 2019-02-24T17:27:14.013105Z
        Instant instantLDT = LocalDateTime.now().toInstant(ZoneOffset.UTC);

    }
}
