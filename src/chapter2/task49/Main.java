package javalang.chapter2.task49;

public class Main {
    public static void main(String[] args) {
        ImmutableDog dog = new ImmutableDog("Sharik");
        System.out.println(dog.getName());
    }

    //mark class as final
    public static final class ImmutableDog {
        //mark field as final
        private final String name;

        public ImmutableDog(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
