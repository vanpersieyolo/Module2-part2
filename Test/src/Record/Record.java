package Record;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Record {
    public void record() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
            FileWriter fileWriter = new FileWriter("text.txt");
           fileWriter.write(enter);
           fileWriter.close();

    }
}
class Show{
    public static void main(String[] args) {
        Record record = new Record();
        try {
            record.record();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
