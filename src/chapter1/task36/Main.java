package javalang.chapter1.task36;

public class Main {
    public static void main(String[] args) {
        float f = 0.1f;
        float nextdownf = Math.nextDown(f); // 0.099999994
        float nextupf = Math.nextUp(f); // 0.10000001
        double d = 0.1d;
        double nextdownd = Math.nextDown(d); // 0.09999999999999999
        double nextupd = Math.nextUp(d); // 0.10000000000000002

        double x = 1.0d;
        double nextUpx = Math.nextUp(x);

        int i = 0;
        while (i < 10000) {
            nextUpx = Math.nextUp(nextUpx);
            System.out.println(nextUpx);
            i++;
        }

    }
}
