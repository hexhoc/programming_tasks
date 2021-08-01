package javalang.chapter1.task10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> result = permutations("123");
        System.out.println(result);
    }

    public static List<String> permutations(String str) {
        char[] chars = str.toCharArray();
        List<String> result = new ArrayList<>();
        permutations(0, chars, result);
        return result;
    }

    private static void permutations(int nextIndex, char[] arr, List<String> result) {
        if (nextIndex == arr.length - 1) {
            result.add(new String(arr));
        }

        for (int previousIndex = nextIndex; previousIndex <= arr.length - 1; previousIndex++) {
            swap(arr, previousIndex, nextIndex);
            permutations(nextIndex + 1, arr, result);
            swap(arr, previousIndex, nextIndex);
        }
    }

    private static void swap(char[] arr, int p1, int p2) {
        if (p1 == p2) return;
        char temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
