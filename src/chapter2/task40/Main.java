package javalang.chapter2.task40;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[10];

        for (int i = 0; i < 8; i++) {
            Dog dog = new Dog();
            dog.name = "funtic" + i;
            dogs[i] = dog;
        }

        checkNullInArray(dogs);
        checkNullInArrayFuncStyle(dogs);
    }

    public static void checkNullInArray(Dog[] dogs) {
        for (Dog dog : dogs) {
            if (dog != null) {
                System.out.println(dog.name);
            }
        }
    }


    public static void checkNullInArrayFuncStyle(Dog[] dogs) {
        //We can use non null method for check each object
        var dogsList = Arrays.stream(dogs)
                .filter(Objects::nonNull)
                .toList();

        for (Dog dog : dogsList) {
            System.out.println(dog.name);
        }
    }

    static class Dog {
        String name;
    }
}
