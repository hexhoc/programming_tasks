package javalang.chapter1.task16;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Boolean contain = isStringContainSubstring("Hello world", "orld");
        System.out.println(contain);
    }

    public static Boolean isStringContainSubstring(String str, String substr) {
        Boolean test1 = str.matches("(?i).*" + Pattern.quote(substr) + ".*");
        Boolean test2 = str.indexOf(substr) >= 0;
        Boolean test3 = str.contains(substr);

        return test3;

    }
}
