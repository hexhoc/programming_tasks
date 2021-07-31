package chapter1.task4;

public class Main {
    public static void main(String[] args) {
        isWordContainOnlyDigitV1("123 check");
        isWordContainOnlyDigitV1("123");
        isWordContainOnlyDigitV2("123 check");
        isWordContainOnlyDigitV2("123");
    }

    public static void isWordContainOnlyDigitV1(String str) {
        long count = str.chars().filter(i -> !Character.isDigit(i)).count();
        Boolean result = count <= 0;
        System.out.println(result);
    }

    public static void isWordContainOnlyDigitV2(String str) {
        Boolean result = !str.chars().anyMatch(i -> !Character.isDigit(i));
        System.out.println(result);
    }

}
