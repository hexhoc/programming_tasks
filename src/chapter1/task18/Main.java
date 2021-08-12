package javalang.chapter1.task18;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        boolean result = isAnagram("Mother-in-law", "Hitler woman");
        System.out.println(result);
        boolean result2 = isAnagramFuncStyle("Mother-in-law", "Hitle woman");
        System.out.println(result2);

    }

    public static boolean isAnagram(String str1, String str2) {

        char[] charArr1 = str1.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();
        char[] charArr2 = str2.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        String sortStr1 = new String(charArr1);
        String sortStr2 = new String(charArr2);

        return sortStr1.equals(sortStr2);

    }

    public static boolean isAnagramFuncStyle(String str1, String str2) {

        String sortStr1 = str1.chars().map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        String sortStr2 = str2.chars().map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return sortStr1.equals(sortStr2);

    }

}
