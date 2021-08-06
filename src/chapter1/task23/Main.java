package chapter1.task23;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "Monday\n" +
                "Tuesday\n" +
                "Wednesday\n" +
                "Thursday\n" +
                "Friday\n" +
                "Saturday\n" +
                "Sunday";

        String result = applyIndent(str);
        System.out.println(result);

        String result2 = applyCascadeIndent(str);
        System.out.println(result2);

        String result3 = applyIndentByStrLength(str);
        System.out.println(result3);

    }

    public static String applyIndent(String str) {
        return str.indent(3);
    }

    public static String applyCascadeIndent(String str) {

        StringBuilder result = new StringBuilder();
        String[] strArr = str.split("\n");

        for (int i = 0; i < strArr.length; i++) {
            result.append(strArr[i].indent(i));
        }

        return result.toString();
    }

    public static String applyIndentByStrLength(String str) {

        String result = str.lines()
                .map(s->s.indent(s.length()))
                .collect(Collectors.joining());

        return result;
    }


}
