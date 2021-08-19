package javalang.chapter2.task57;

public class Main {
    public static void main(String[] args) {

        Car car = createCar(CarType.SPORT);
        System.out.println(car);

    }

    public static Car createCar(CarType carType) {

        Car car = null;

        switch (carType) {
            case SPORT -> {
                car = new Car();
                car.brand = "ferrari";
                car.carType = carType;
                return car;
            }
            case TRUCK -> {
                car = new Car();
                car.brand = "BELAZ";
                car.carType = carType;
                return car;
            }
            default -> {
                return car;
            }
        }
    }

    public static class Car {
        public String brand;
        public CarType carType;

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", carType=" + carType +
                    '}';
        }
    }
}
