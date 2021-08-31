package javalang.chapter3.task60;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate onlyDate = LocalDate.now();
        System.out.println(onlyDate);

        LocalTime onlyTime = LocalTime.now();
        System.out.println(onlyTime);

    }
}
