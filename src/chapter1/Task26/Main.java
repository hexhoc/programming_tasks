package chapter1.Task26;

public class Main {

    public static void main(String[] args) {
        int maxInt1 = Integer.MAX_VALUE;
        int maxInt2 = Integer.MAX_VALUE;

        int result1 = maxInt1 + maxInt2;
        System.out.println(result1);

        //here will be exception with integer overflow
        //with bug numbers recommend use addExact
        int result2 = Math.addExact(maxInt1, maxInt2);
        System.out.println(result2);
    }

}
