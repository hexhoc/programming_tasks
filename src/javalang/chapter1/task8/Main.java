package javalang.chapter1.task8;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeSpaceFromString("hello world all"));
    }

    public static String removeSpaceFromString(String str) {
        //return str.replace(" ", "");
        //regex "\s" - remove all space, include \t \n \r
        return str.replaceAll("\s", "");
    }
}
