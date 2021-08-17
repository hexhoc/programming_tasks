package javalang.chapter2.task46;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {


    }

    public static class Car {
        public String name;

        public Car(String name) {
            this.name = name;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (getClass() != o.getClass()) return false;

            Car car = (Car) o;

            if (this.hashCode() != car.hashCode()) return false;

            return this.name.equals(car.name);
        }

        @Override
        public int hashCode() {
            return this.name.hashCode();
        }
    }
}
