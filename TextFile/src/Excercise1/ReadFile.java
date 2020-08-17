package Excercise1;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void readFile(String sourceFile, ArrayList arr0) throws IOException {
        File file = new File(sourceFile);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line =   bufferedReader.readLine()) != null){
            System.out.println(line);
            arr0.add(line);
        }
        bufferedReader.close();
    }
}
