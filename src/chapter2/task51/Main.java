package javalang.chapter2.task51;

public class Main {
    public static void main(String[] args) {

//        When a class (immutable or mutable) has too many fields, it
//        requires a constructor with many arguments. When some of
//        those fields are required and others are optional, this class will
//        need several constructors to cover all the possible
//        combinations. This becomes cumbersome for the developer
//        and for the user of the class. This is where the Builder pattern
//        comes to the rescue.

        Car.CarBuilder carBuilder = new Car.CarBuilder()
                .withName("Lastochka")
                .withBody("sedan")
                .withBrand("ferrari")
                .withColor("black")
                .withEngine(new Engine("F134"));

        Car sportCar = new Car(carBuilder);

        System.out.println(sportCar);
    }
}
