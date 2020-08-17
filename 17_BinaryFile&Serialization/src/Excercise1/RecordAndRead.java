package Excercise1;

import java.io.*;
import java.util.ArrayList;

public class RecordAndRead {
    public static void recordFile(String source, ArrayList<Product> pr){
        try {
            FileOutputStream f= new FileOutputStream(source);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
            objectOutputStream.writeObject(pr);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<Product>readdFile(String source){

        try {
            FileInputStream f = new FileInputStream(source);
            ObjectInputStream objectInputStream = new ObjectInputStream(f);
            ArrayList<Product> prod =  (ArrayList<Product>) objectInputStream.readObject();
            objectInputStream.close();
            return prod;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
