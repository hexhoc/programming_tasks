package javalang.chapter3.task58;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        parseDateWithoutFormatter();
        parseDateWithFormatter();
        parseDateToString();
    }

    public static void parseDateWithoutFormatter() {

        //parse without formatter
        LocalDate localdate1 = LocalDate.parse("2019-08-31");
        System.out.println(localdate1);

        LocalTime localtime1 = LocalTime.parse("23:59:59");
        System.out.println(localtime1);

        LocalDateTime localdatetime1 = LocalDateTime.parse("2019-08-31T23:59:59");
        System.out.println(localdatetime1);

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2019-08-31T12:00:00+03:00");
        System.out.println(offsetDateTime);

    }

    public static void parseDateWithFormatter() {

        //parse with pattern
        LocalDate localdate2 = LocalDate.parse("31.08.2019", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(localdate2);

    }

    public static void parseDateToString() {

        //parse with pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String date = formatter.format(LocalDate.now());

        System.out.println(date);

    }
}
