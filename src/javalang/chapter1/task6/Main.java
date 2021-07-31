package javalang.chapter1.task6;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var result1 = countCharacterOccurrencesV1("Hello world", 'l');
        System.out.println(result1);

        var result2 = countCharacterOccurrencesV2("Hello world", 'l');
        System.out.println(result2);

        var result3 = countCharacterOccurrencesV3("Hello world", 'l');
        System.out.println(result3);
    }

    public static Integer countCharacterOccurrencesV1(String str, Character ch) {
        Integer result = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }
        }

        return result;
    }

    public static Long countCharacterOccurrencesV2(String str, Character ch) {
        long result = 0L;

        result = str.chars()
                .filter(c -> c == ch)
                .count();

        return result;
    }

    public static Integer countCharacterOccurrencesV3(String str, Character ch) {
        int result = 0;

        result = str.length() - (str.replace(String.valueOf(ch), "")).length();

        return result;
    }

}
