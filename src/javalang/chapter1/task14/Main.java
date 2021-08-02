package javalang.chapter1.task14;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        char result = maxOccurrenceChar("Hello world");
        System.out.println(result);

        char result2 = maxOccurrenceCharFuncStyle("Hello world");
        System.out.println(result2);
    }

    public static Character maxOccurrenceChar(String str) {
        HashMap<Character, Integer> charsMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            Integer charOccurrence = charsMap.get(currChar);
            if (charOccurrence == null) {
                charsMap.put(currChar, 1);
            } else {
                charsMap.put(currChar, ++charOccurrence);
            }
        }

        Integer maxOccurence = Collections.max(charsMap.values());
        Character resultChar = null;

        for (var entrySet : charsMap.entrySet()) {
            if (entrySet.getValue().equals(maxOccurence)) {
                resultChar = entrySet.getKey();
            }
        }

        return resultChar;
    }

    public static Character maxOccurrenceCharFuncStyle(String str) {
        var entrySetOptional = str.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(s -> s, Collectors.summingInt(s -> 1)))
                .entrySet()
                .stream()
                .sorted((t1, t2) -> t2.getValue().compareTo(t1.getValue()))
                .findFirst();


        return entrySetOptional.get().getKey();
    }

}
