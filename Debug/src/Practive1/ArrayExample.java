package Practive1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class ArrayExample {
    public Integer[] creatRandom (){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sách mảng là: ");
        for (int i = 0; i < 100 ; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 phần tử bất kì: ");
        int x = scanner.nextInt();
    try {
        System.out.println("giá trị của phần tử có chỉ số"+ x + "là: " + arr[x]);
    }catch (IndexOutOfBoundsException e){
        System.out.println("chỉ số ko nằm trong giới hạn");
    }

    }
}
