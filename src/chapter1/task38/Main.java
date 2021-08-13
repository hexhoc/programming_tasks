package javalang.chapter1.task38;

public class Main {
    public static void main(String[] args) {
        double a = 2.2d;
        double b = 2.2d;
        double c = 2.2d;

        double x = a*b+c;
        System.out.println(x);

        //And more boosted and accuracy method only for intel processor
        double fma = Math.fma(a, b, c);
        System.out.println(fma);
    }
}
