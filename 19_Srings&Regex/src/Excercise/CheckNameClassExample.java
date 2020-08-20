package Excercise;
import java.util.Scanner;

public class CheckNameClassExample {
    private static NameClassExample nameClassExample = new NameClassExample();
    public static String inputNameClass = "";
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            inputNameClass = scanner.nextLine();
            boolean check = nameClassExample.validate(inputNameClass);
            System.out.println("Name Class : " + inputNameClass + ", Check: " + check);
        }while (true);
    }
}
