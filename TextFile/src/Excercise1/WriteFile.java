package Excercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public static void writeFile(String target,ArrayList<String> arr1 ) throws IOException {
        FileWriter fileWriter = new FileWriter(target);
        for (String a : arr1) {
            fileWriter.write(a +"\n");
        }
        fileWriter.close();
    }
}
