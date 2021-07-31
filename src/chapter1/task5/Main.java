package chapter1.task5;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        countVowelAndConsonant("Hello world");
    }

    public static void countVowelAndConsonant(String str) {
        HashMap<String, Long> result = new HashMap<String, Long>();

        result.put("vowel", str.chars()
                .filter(i -> isVowel((char) i))
                .count());

        result.put("consonant", str.chars()
                .filter(i -> isConsonant((char) i))
                .count());

        System.out.println(result);
    }

    public static boolean isVowel(Character ch) {
        Character[] vowel = {'A', 'E', 'I', 'O', 'U'};
        return Arrays.binarySearch(vowel, Character.toUpperCase(ch)) > 0;
    }

    public static boolean isConsonant(Character ch) {
        Character[] vowel = {'B', 'C', 'D', 'F', 'G',
                'H', 'J', 'K', 'L', 'M',
                'N', 'P', 'Q', 'R', 'S',
                'T', 'V', 'W', 'X', 'Y', 'Z'};

        return Arrays.binarySearch(vowel, Character.toUpperCase(ch)) > 0;
    }
}
