package javalang.chapter2.task51;

public final class Car {
    private final String name;
    private final String body;
    private final String brand;
    private final String color;
    private final Engine engine;

    public Car(CarBuilder carBuilder) {
        this.name = carBuilder.name;
        this.body = carBuilder.body;
        this.brand = carBuilder.brand;
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static class CarBuilder {
        private String name;
        private String body;
        private String brand;
        private String color;
        private Engine engine;

        public CarBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public CarBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
    }
}
