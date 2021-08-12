package javalang.chapter1.task27;

public class Main {

    public static void main(String[] args) {
        String nri = "255500";
        int result1 = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
        int result2 = Integer.parseUnsignedInt(nri);
        int result3 = Integer.parseUnsignedInt(nri, 1, 4, Character.MAX_RADIX);
        // Integer.MAX_VALUE + 1 = 2147483647 + 1 = 2147483648
        int maxValuePlus1 = Integer.parseUnsignedInt("2147483648");
        System.out.println(maxValuePlus1);
    }
}
