package javalang.chapter2.task41;

public class Main {
    public static void main(String[] args) {

        Dog[] arr = new Dog[10];

        for (int i = 0; i < 8; i++) {
            arr[i] = new Dog();
        }

        for (int i = 0; i < 12; i++) {
            try {
                arr[i].sayHello();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("index out of bound");
            } catch (NullPointerException e) {
                System.out.println("null pointer");
            } catch (Exception e) {
                System.out.println("something else");
            }
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("wof wof");
        }
    }
}
