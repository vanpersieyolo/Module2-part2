package Excercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void main(String[] args) {
        String csvFile = "D:\\Fileinput\\countries.csv";
        BufferedReader bufferedReader = null;
        String line = "";
        String splitBy = ",";

        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            while ((line =bufferedReader.readLine())!= null){
                String[] country = line.split(splitBy);
                System.out.println(country[4]+" ; "+ country[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
