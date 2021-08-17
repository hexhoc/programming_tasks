package javalang.chapter2.task44;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < 10; i++) {

            System.out.println(arr[i]);
        }

    }

    public static void requireInRangeIndex(int curIndex, long lastIndex) {
        if (curIndex >= lastIndex) {
            throw new IndexOutOfBoundsException("index out of range");
        }
    }

}
