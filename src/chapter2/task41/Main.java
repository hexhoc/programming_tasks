package javalang.chapter2.task41;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car[] arr = new Car[10];

        for (int i = 0; i < 8; i++) {
            arr[i] = new Car(null);
        }

        for (int i = 0; i < 12; i++) {
            try {
                arr[i].start();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("index out of bound");
            } catch (NullPointerException e) {
                System.out.println("null pointer");
            } catch (Exception e) {
                System.out.println("something else");
            }
        }
    }

    public static class Car {
        private final String name;

        public Car(String name) {
            //So, if the specified reference is null, then Objects.requireNonNull()
            //will throw a NullPointerException with the message provided.
            //Otherwise, it returns the checked reference.
            this.name = Objects.requireNonNull(name, "Ooops its null");
        }

        public void start() {
            System.out.println("The car starts");
        }

    }
}
