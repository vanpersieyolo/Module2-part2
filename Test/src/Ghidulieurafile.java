import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class    Ghidulieurafile {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        try {
//            Scanner scanner = new Scanner(System.in);
//            String input = scanner.nextLine();
            PrintWriter printWriter = new PrintWriter(new FileOutputStream("D:\\Fileinput\\inputJava.txt", true));
            for (Integer a : arr) {
                printWriter.println(a);
            }
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
