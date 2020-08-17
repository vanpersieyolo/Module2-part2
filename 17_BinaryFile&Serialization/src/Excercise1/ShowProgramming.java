package Excercise1;

import java.util.ArrayList;

public class ShowProgramming {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products = RecordAndRead.readdFile("Saveproduct.txt");
        QuanliSp.productmanege(products);
    }
}
