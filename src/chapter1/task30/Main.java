package javalang.chapter1.task30;

public class Main {
    public static void main(String[] args) {
        // signed division
        // -1
        int divisionSignedMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;
        // 0
        int divisionSignedMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;
        // signed modulo
        // -1
        int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
        // 2147483647
        int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;

        // division unsigned
        int divisionUnsignedMinMax = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE); // 1
        int divisionUnsignedMaxMin = Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE); // 0

        int moduloUnsignedMinMax = Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int moduloUnsignedMaxMin = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
}
