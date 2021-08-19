package javalang.chapter2.task53;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("ferrari", new Engine("F134"));
        System.out.println(car);

        cloneViaObjectClone(car);
        cloneViaConstructor(car);

    }

    public static void cloneViaObjectClone(Car car) {
        Car clone = null;
        try {
            clone = (Car) car.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(clone);

    }

    public static void cloneViaConstructor(Car car) {
        Car clone = new Car(car);
    }

    //implements Cloneable interface and override clone() method
    public static final class Car implements Cloneable{
        private final String brand;
        private final Engine engine;

        //for clone via constructor
        public Car(Car anotherCar) {
            this.brand = anotherCar.brand;
            this.engine = new Engine(anotherCar.getEngine().getName());
        }

        public Car(String brand, Engine engine) {
            this.brand = brand;
            this.engine = engine;
        }

        public String getBrand() {
            return brand;
        }

        public Engine getEngine() {
            return engine;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", engine=" + engine +
                    '}';
        }
    }

    public static final class Engine {
        private final String name;

        public Engine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
