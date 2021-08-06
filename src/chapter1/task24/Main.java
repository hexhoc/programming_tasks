package chapter1.task24;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String result1 = transformStringV1("Hello world");
        System.out.println(result1);

        String result2 = transformStringV2("Hello world");
        System.out.println(result2);
    }

    public static String transformStringV1(String str) {
        String result = Stream.of(str)
                .map(s->s.toUpperCase())
                .map(s->s.replace("O", "OOO"))
                .collect(Collectors.joining());

        return result;
    }

    public static String transformStringV2(String str) {
        String result = str.transform(s -> s.toUpperCase())
                .transform(s->s.replace("O", "OOO"));

        return result;
    }
}
