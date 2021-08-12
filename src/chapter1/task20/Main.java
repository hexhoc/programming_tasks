package javalang.chapter1.task20;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String result = concatRepeatV1("Hello", 3);
        System.out.println(result);

        String result2 = concatRepeatV2("Hello", 3);
        System.out.println(result2);

        String result3 = concatRepeatV3("Hello", 3);
        System.out.println(result3);
    }

    public static String concatRepeatV1(String str, int repeat) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            strb.append(str);
        }

        return strb.toString();
    }

    public static String concatRepeatV2(String str, int repeat) {
        return str.repeat(repeat);
    }

    public static String concatRepeatV3(String str, int repeat) {
        return str.join("", Collections.nCopies(repeat, str));
    }
}
