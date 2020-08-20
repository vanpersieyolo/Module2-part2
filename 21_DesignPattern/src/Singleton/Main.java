package Singleton;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Connection> arr = new ArrayList<>();
        Connection connection = Connection.get_instance();
        Connection connection1 = Connection.get_instance();

    }
}
