package javalang.chapter1.task34;

public class Main {
    public static void main(String[] args) {
        Long longValue = 123456789L;
        int intValue = longValue.intValue();
        //If we want to get an ArithmeticException
        int intValue2 = Math.toIntExact(longValue);

    }
}
