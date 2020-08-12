package Excercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào size mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];

        for (int j = 0; j <list.length ; j++) {
            System.out.println("nhập số vào vị trí thứ "+ j);
            list[j] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
    }
    public static void chen(int[] list){
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list[i]  ; j++) {
                if (list[i] < list[j]){

                }
            }
        }
    }
}
