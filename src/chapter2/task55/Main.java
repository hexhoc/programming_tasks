package javalang.chapter2.task55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        switch (result) {
            case "hi" -> System.out.println("hi");
            case "bye" -> System.out.println("bye");
            default -> System.out.println("nothing to say");
        }

    }

}
