package javalang.chapter2.task45;

public class Main {
    public static void main(String[] args) {

        requireRange(1, 8, 10);
        requireRange(0, 9, 10);
        requireRange(0, 10, 10);
        requireRange(-1, 8, 10);

    }

    public static void requireRange(int start, int end, int length) {
        if(start < 0 || end >= length) {
            throw new IndexOutOfBoundsException("Range is out of bound");
        }
    }
}
