package javalang.chapter2.task43;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(null, null);

        System.out.println(car.name);
        System.out.println(car.color);
    }

    public static class Car {
        public String name;
        public String color;

        public Car(String name, String color) {
            this.name = Objects.requireNonNullElse(name, "empty name");
            this.color = Objects.requireNonNullElseGet(color, () -> "rgb(25,25,25)");
        }

    }
}
