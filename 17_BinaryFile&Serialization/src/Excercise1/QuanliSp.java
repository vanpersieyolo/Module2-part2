package Excercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanliSp {
    public static void productmanege(ArrayList<Product> products){
        Scanner scanner = new Scanner(System.in);
        int idCodeAdd = 0;
        do {
            System.out.println("1. Add product ");
            System.out.println("2. Remove product");
            System.out.println("3. Find product");
            System.out.println("4. Show all pro duct");
            System.out.println("0. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    int prCode = ++idCodeAdd;
                    System.out.println("nhập tên sản phẩm: ");
                    String namePr = scanner.nextLine();
                    System.out.println("nhập hãng sản xuất: ");
                    String brandPr = scanner.nextLine();
                    System.out.println("nhập giá sản phẩm: ");
                    int pricePr = Integer.parseInt(scanner.nextLine());
//                    int productCode, String namePr, String brandPr, int price
                    Product product = new Product(prCode,namePr,brandPr,pricePr);
                    products.add(product);
                    break;
                case 2:
                    System.out.println("nhập vào mã sản phẩm cần xóa: ");
                    int prCodeRemove = Integer.parseInt(scanner.nextLine());
                    for (Product product1: products) {
                        if (prCodeRemove == product1.getProductCode()){
                            products.remove(product1);
                            System.out.println("đã xóa sp");
                        }
                    }
                    System.out.println("ko có mã sp");
                    break;
                case 3:
                    System.out.println("nhập vào mã sp cần tìm: ");
                    int prCodeFind = Integer.parseInt(scanner.nextLine());
                    for (Product pr: products) {
                        if (prCodeFind == pr.getProductCode()){
                            System.out.println(pr);
                            return;
                        }
                    }
                    System.out.println("ko có sp");
                   break;
                case 4:
                    for (Product pr1: products) {
                        System.out.println(pr1);
                    }
                    break;
                case 0:
                    RecordAndRead.recordFile("Saveproduct.txt",products);
                    return;
            }
        }while (true);
    }
}
