package javalang.chapter2.task48;

public class Main {
    public static void main(String[] args) {
        //String use string constant pool (SCP)
        String x = "book";
        String y = "book";
        String z = "book";

        //actually Java creates only one String
        //all of this variables reference to one object in SCP with value "book"

    }
}
