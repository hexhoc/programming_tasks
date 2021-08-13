package javalang.chapter1.task33;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // The BigInteger class is a very handy tool for representing immutable
        // arbitrary-precision integers. This class also contains methods
        // (originating from java.lang.Number) that are useful for converting BigInteger into a
        // primitive type such as byte, long, or double

        BigInteger bigIntValue = new BigInteger("12345678910");
        int intValue = bigIntValue.intValue();
        //If we want to get an ArithmeticException
        int intValue2 = bigIntValue.intValueExact();

        //It is necessary to use string in constructor. Cause if we use double value, it may
        //work incorrect
        BigDecimal bigDecValue = new BigDecimal("5456.545");
        double decValue = bigDecValue.doubleValue();

        //Demonstrate how can it work incorrect
        BigDecimal bigDecValue2 = new BigDecimal(5456.545);
        System.out.println(bigDecValue2.doubleValue());
    }
}
