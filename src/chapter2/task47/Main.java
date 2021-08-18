package javalang.chapter2.task47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // all of this primitive types are immutable
        byte bt = 1; // 1 byte
        short sh = 1; // 2 byte
        int it = 1; // 4 byte
        long lg = 1; // 8 byte
        float fl = 1; // 4 byte
        double db = 1; // 8 byte
        boolean bl = true; // 1 byte
        char ch = ' '; // 2 byte

        //mutable and modifiable collection
        //we can change the objects in the list and we can change the list
        ArrayList<Cat> CatList = new ArrayList<>();
        CatList.add(new Cat("Barsik"));
        CatList.add(new Cat("Murzik"));
        //we can change object
        CatList.get(0).name = "Begemot";
        //we can change collection
        CatList.remove(1);

        //immutable and modifiable collection
        //we cannot change object(dog immutable)
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Sharik"));
        dogList.add(new Dog("Mumu"));
        //we can't change object because dog immutable
        //dogList.get(0).name = "turbo";

        //but we still can change collection
        dogList.remove(1);


        //immutable and unmodifiable collection
        List<Dog> newDogList = Collections.unmodifiableList(dogList);
        newDogList.add(new Dog("Sharik"));
        newDogList.add(new Dog("Mumu"));
        //we can't change object because dog immutable
        //dogList.get(0).name = "turbo";

        //we can't change collection
        newDogList.remove(1);

    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

    }

    //immutable class
    public static final class Dog {
        public final String name;

        public Dog(String name) {
            this.name = name;
        }
    }
}
