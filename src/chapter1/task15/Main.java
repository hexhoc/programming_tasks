package javalang.chapter1.task15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        sortStringArray(new String[] {"hi", "all", "there", "sort", "me"});
        sortStringArrayV2(new String[] {"hi", "all", "there", "sort", "me"});
        sortStringArrayFuncStyle(new String[] {"hi", "all", "there", "sort", "me"});
    }

    public static void sortStringArray(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j].length() < arr[j-1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void sortStringArrayV2(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public static void sortStringArrayFuncStyle(String[] arr) {

        arr = Arrays.stream(arr)
                .sorted((t1, t2) -> Integer.compare(t1.length(), t2.length()))
                .toArray(String[]::new);

    }

}
