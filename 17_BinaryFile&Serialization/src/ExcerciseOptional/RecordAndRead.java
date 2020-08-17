package ExcerciseOptional;

import java.io.*;

public class RecordAndRead {
    public static void record(String str){
        File file = new File("TargetFile.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String read (){
        String str = "";
        try {
            File file = new File("D:/Module2_part2/ExcerciseOptional(text)/SourceFile.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader b = new BufferedReader(fileReader);
            String line = "";
            while ((line = b.readLine()) != null){
                str +=line+"\n";
            }
            b.close();
            return str;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = RecordAndRead.read();
        System.out.println(str);
        RecordAndRead.record(str);
    }
}
