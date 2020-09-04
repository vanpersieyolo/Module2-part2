package PractiveExam;

import java.io.*;
import java.util.ArrayList;

public class IO implements Serializable{
    public static ArrayList<FulltimeStaff> readFile(String source){
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<FulltimeStaff> a;
            try {
                a = (ArrayList<FulltimeStaff>) objectInputStream.readObject();
            }catch (Exception e){
                a = new ArrayList<>();
            }
            objectInputStream.close();
            return a;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void record(ArrayList<FulltimeStaff> arrayList,String source){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(source);
            ObjectOutputStream o = new ObjectOutputStream(fileOutputStream);
            o.writeObject(arrayList);
            o.close();
            System.out.println("đã lưu và out");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
