package javalang.chapter1.task1;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> dublicates = countDublicatesChar("hello world");
        System.out.println(dublicates);
        countDublicateCharStream("hello world");
    }

    public static void countDublicateCharStream(String str) {
        var x = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
        System.out.println(x);
    }

    public static HashMap<String, Integer> countDublicatesChar(String str) {

        HashMap<String, Integer> dupl = new HashMap<>();

        int[] charsArr = str.chars().toArray();
        for(var charElement : charsArr) {
            String stringElement = Character.toString(charElement);
            Integer dublValue = dupl.get(stringElement);
            if (dublValue == null) {
                dupl.put(stringElement, 1);
            } else {
                dupl.put(stringElement, ++dublValue);
            }
        }
        return  dupl;

    }
}
