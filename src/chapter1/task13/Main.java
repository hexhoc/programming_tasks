package javalang.chapter1.task13;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        removeChar("hello world", 'l');
        removeCharFuncStyle("hello world", 'l');
    }

    public static void removeChar(String str, Character ch) {
        String result = str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
        System.out.println(result);
    }

    public static void removeCharFuncStyle(String str, Character ch) {
        String result = str.chars()
                .filter(i -> (char) i != ch)
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
        System.out.println(result);
    }

}
