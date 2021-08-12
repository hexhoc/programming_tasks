package javalang.chapter1.task17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int result = countStringInStringV1("Hohoho hello Holand", "Ho");
        System.out.println(result);

        int result1 = countStringInStringV2("Hohoho hello Holand", "Ho");
        System.out.println(result1);

        int result2 = countStringInStringV3("Hohoho hello Holand", "Ho");
        System.out.println(result2);
    }

    public static int countStringInStringV1(String str, String subStr) {

        int count = 0;
        int position = 0;
        int skipChar = subStr.length();

        while( (position = str.indexOf(subStr, position)) != -1) {
            position = position + skipChar;
            count++;
        }
        return count;
    }

    public static int countStringInStringV2(String str, String subStr) {

        int count = str.split(subStr).length-1;
        return count;
    }

    //using matcher and patter
    public static int countStringInStringV3(String str, String subStr) {

        Pattern pattern = Pattern.compile(subStr);
        Matcher matcher = pattern.matcher(str);
        int position = 0;
        int count = 0;

        while(matcher.find(position) ) {
            position = matcher.start()+1;
            count++;
        }

        return count;
    }
}
