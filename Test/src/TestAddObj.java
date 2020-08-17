import java.io.IOException;
import java.util.ArrayList;

public class TestAddObj {
    public static void main(String[] args) {
        ArrayList<Obj> arrObj = new ArrayList<>();
        Obj obj = new Obj(1,"van","hn");
        arrObj.add(obj);
        try {
            RecordObj.addObj1(arrObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
