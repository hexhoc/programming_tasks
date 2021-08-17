package javalang.chapter2.task42;

import java.util.Objects;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(null);

    }

    public static class Car {

        private String name;

        public Car(String name) {
            this.name = requireNonNullElseThrowIAE(name, "this is a illegal argument exception");
        }
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, String message) {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }
        return obj;
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, Supplier<String> messageSupplier) {
        if (obj == null) {
            throw new IllegalArgumentException(messageSupplier == null
                    ? null : messageSupplier.get());
        }
        return obj;
    }

}
