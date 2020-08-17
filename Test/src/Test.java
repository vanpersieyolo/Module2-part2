import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("D:\\Fileinput\\targetJava.txt"),("UTF-8"));

        while (scanner.hasNextInt()){
            int input  = scanner.nextInt();
            System.out.println(input);
        }
        scanner.nextLine();
        String data = scanner.nextLine();
        System.out.println(data);
        scanner.close();
    }
}
