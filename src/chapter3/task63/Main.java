package javalang.chapter3.task63;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2018, 1,1);
        LocalDate endDate = LocalDate.of(2019,1,1);
        Period period = Period.between(startDate, endDate);

        System.out.println(period);

        Period fromDays = Period.ofDays(120);
        System.out.println(fromDays);

        //Duration of time using time-based values
        LocalTime startTime = LocalTime.of(12,0, 0);
        LocalTime endTime = LocalTime.of(15,0,0);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);

        Duration fromSeconds = Duration.ofSeconds(120);
        System.out.println(fromSeconds);

    }
}
