package javalang.chapter3.task59;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String dateFormat = date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(dateFormat);
    }
}
