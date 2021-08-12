package javalang.chapter1.task31;

public class Main {
    public static void main(String[] args) {
        float f1 = 4.5f;
        boolean f1f = Float.isFinite(f1); // f1 = 4.5, is finite
        float f2 = f1 / 0;
        boolean f2f = Float.isFinite(f2); // f2 = Infinity, is not finite
        float f3 = 0f / 0f;
        boolean f3f = Float.isFinite(f3); // f3 = NaN, is not finite

        double d1 = 0.000333411333d;
        boolean d1f = Double.isFinite(d1); // d1 = 3.33411333E-4,is finite
        double d2 = d1 / 0;
        boolean d2f = Double.isFinite(d2); // d2 = Infinity, is not finite
        double d3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(d3); // d3 = NaN, is not finite
        
    }
}
