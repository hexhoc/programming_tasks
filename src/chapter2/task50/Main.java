package javalang.chapter2.task50;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("AUDI", engine);

        System.out.println(car.toString());

        //we can change mutable object in immutable object
        engine.name = "V1000";

        System.out.println(car.toString());

    }

    //Is this class still immutable? The answer is—no. The Car class
    //is not immutable because its state can be changed. It has mutable object - engine
    public static final class Car {
        private final String name;
        private final Engine engine;

        public Car(String name, Engine engine) {
            this.name = name;
            this.engine = engine;
        }

        public String getName() {
            return this.getName();
        }

        public Engine getEngine() {
            return this.engine;
        }


        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", engine=" + engine.name +
                    '}';
        }
    }

    public static class Engine {
        public String name;

        public Engine(String name) {
            this.name = name;
        }
    }
}
