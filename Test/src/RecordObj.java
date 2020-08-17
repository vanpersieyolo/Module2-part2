import java.io.*;
import java.util.ArrayList;

public class RecordObj {
    public static void addObj1(ArrayList<Obj> arr) throws IOException {

       ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Fileinput\\Test.txt"));
       objectOutputStream.writeObject(arr);
    }

}
