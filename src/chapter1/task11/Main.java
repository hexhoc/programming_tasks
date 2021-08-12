package javalang.chapter1.task11;

public class Main {
    public static void main(String[] args) {
        var result = isPalindrome("Lewd did I live & evil I did dwel.");
        System.out.println(result);
    }

    public static boolean isPalindrome(String str) {
        String strToCompare = str.replaceAll("[^a-zA-Z]", "");
        return strToCompare.equalsIgnoreCase(new StringBuilder(strToCompare).reverse().toString());
    }
}
