package javalang.chapter1.task2;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        findFirstNonRepeatedChar("HHeello_worldaa");
    }

    public static void findFirstNonRepeatedChar(String str) {

        Character nonRepeatedChar = null;

        for (int i = 0; i < str.length() - 1; i++) {
            char toFindChar = str.charAt(i);
            var x = str.chars()
                    .filter(i1 -> i1 == toFindChar)
                    .mapToObj(i1 -> (char) i1)
                    .collect(Collectors.toList());

            if (x.size() == 1) {
                nonRepeatedChar = toFindChar;
                break;
            }
              }
        System.out.println(nonRepeatedChar.toString());

    }
}
