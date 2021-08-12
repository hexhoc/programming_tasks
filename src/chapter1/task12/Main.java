package javalang.chapter1.task12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        removeDublicatesCharsV1("Hello world");
        removeDublicatesCharsV2("Hello world");
    }

    public static void removeDublicatesCharsV1(String str) {
       var uniqueChars = str.chars()
                .distinct()
                .mapToObj(i -> Character.valueOf((char)i))
                .collect(Collectors.toList());

        System.out.println(uniqueChars);
    }

    public static void removeDublicatesCharsV2(String str) {

        ArrayList<Character> uniqueChars = new ArrayList<>(str.length());

        for(int i =0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
            }
        }
        System.out.println(uniqueChars);
    }
}
