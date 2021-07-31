package chapter1.task3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        invertWords("Hello all, how are you?");
    }

    public static void invertWords(String str) {
        String[] wordsArray = str.split("[^A-Za-z0-9]");
        HashMap<String, String> wordsMap = new HashMap<String, String>();

        for(String word : wordsArray) {
            StringBuilder strb = new StringBuilder(word);
            strb.reverse();
            wordsMap.put(word, strb.toString());
        }

        for(var wordsSet: wordsMap.entrySet()) {
            str = str.replace(wordsSet.getKey(), wordsSet.getValue());
        }

        System.out.println(str);
    }
}
