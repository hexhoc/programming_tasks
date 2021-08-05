package chapter1.task22;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};
        String result1 = longestCommonPrefix(texts);
        System.out.println(result1);

        String result2 = longestCommonPrefixV2(texts);
        System.out.println(result2);

        String result3 = longestCommonPrefixV3(texts);
        System.out.println(result3);

    }

    public static String longestCommonPrefix(String[] strArr) {

        if (strArr.length <= 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        //define maximum common length
        int commonLength = strArr[0].length();
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() < commonLength) {
                commonLength = strArr[i].length();
            }
        }

        for (int charIndex = 0; charIndex < commonLength; charIndex++) {

            HashSet<Character> charSet= new HashSet<>();

            for (int strIndex = 0; strIndex < strArr.length; strIndex++) {
                charSet.add(strArr[strIndex].charAt(charIndex));
            }

            if (charSet.size() == 1) {
                char commonChar = charSet.stream().findFirst().get();
                sb.append(String.valueOf(commonChar));
            } else {
                break;
            }
        }

        return sb.toString();
    }

    public static String longestCommonPrefixV2(String[] strArr) {

        if (strArr.length <= 1) {
            return "";
        }

        int arrLength = strArr.length;
        int matchLength = 0;
        int commonLength = Arrays.stream(strArr)
                .map(String::length)
                .min(Integer::compareTo).get();

        for (int charIndex = 0; charIndex < commonLength; charIndex++) {

            HashSet<Character> charSet = new HashSet<>();
            for (int strIndex = 0; strIndex < arrLength; strIndex++) {
                charSet.add(strArr[strIndex].charAt(charIndex));
            }
            if (charSet.size() != 1) {
                break;
            }
            matchLength++;
        }

        return strArr[0].substring(0, matchLength);
    }

    public static String longestCommonPrefixV3(String[] strArr) {

        if (strArr.length <= 1) {
            return "";
        }

        int firstLength = strArr[0].length();
        StringBuilder sb = new StringBuilder();

        for (int charIndex = 0; charIndex < firstLength; charIndex++) {

            char curChar = strArr[0].charAt(charIndex);
            for (int strIndex = 0; strIndex < strArr.length; strIndex++) {
                if (strArr[strIndex].length() <= charIndex
                      ||  strArr[strIndex].charAt(charIndex) != curChar)  {

                    return strArr[0].substring(0, charIndex);
                }
            }
        }

        return "";
    }

}
