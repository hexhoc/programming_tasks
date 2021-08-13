package javalang.chapter1.task37;

public class Main {
    public static void main(String[] args) {
        int x = 123456789;
        int y = 123456789;

        int z = x * y;
        //If we want to get an ArithmeticException
        z = Math.multiplyExact(x,y);
    }
}
