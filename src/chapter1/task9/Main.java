
package javalang.chapter1.task9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        joinByDelimiterV1(new String[]{"hello", "world", "i", "am", "join"}, ' ');
        joinByDelimiterV2(new String[]{"hello", "world", "i", "am", "join"}, ' ');

    }

    public static void joinByDelimiterV1(String[] strings, char delimiter) {

        StringBuilder strb = new StringBuilder();
        for(String str : strings) {
            strb.append(str);
            strb.append(delimiter);
        }

        System.out.println(strb.toString());
    }

    public static void joinByDelimiterV2(String[] strings, char delimiter) {

        String result = Arrays.stream(strings).collect(Collectors.joining(String.valueOf(delimiter)));

        System.out.println(result);
    }

}
