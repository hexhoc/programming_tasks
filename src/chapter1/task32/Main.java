package javalang.chapter1.task32;

public class Main {
    public static void main(String[] args) {
        int x = 30;
        int y = 60;

        if(x > y || x < y) { } else { };

        if(Boolean.logicalOr(x > y, x < y)) { } else { };

        if(Boolean.logicalAnd(x > y, x < y)) { } else { };

        if(Boolean.logicalXor(x > y, x < y)) { } else { };
    }
}
