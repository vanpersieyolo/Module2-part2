package Excercise1;

import java.io.FileWriter;
import java.util.ArrayList;

public class Show {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        try {
            ReadFile.readFile("D:\\Fileinput\\sourceFile.txt",arr);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            WriteFile.writeFile("D:\\Fileinput\\targetFile.txt",arr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
