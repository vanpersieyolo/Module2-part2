package Excercise1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TriangleException extends Exception {
     public static void checkSide(int sideA,int sideB,int sideC) throws checkTriangle {
         if (sideA <= 0 || sideB <= 0 || sideC <= 0){
             throw new checkTriangle();
         }
         if (sideA+sideB <= sideC || sideA + sideC <= sideB || sideB+ sideC <= sideA){
             throw new  checkTriangle();
         }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valueside of triangle ");
        System.out.println("side a: ");
        int sideA = scanner.nextInt();
        System.out.println("side b: ");
        int sideB = scanner.nextInt();
        System.out.println("side c: ");
        int sideC = scanner.nextInt();

        try{
            checkSide(sideA,sideB,sideC);
        }catch (checkTriangle a){
           a.printStackTrace();
        }
        System.out.println("cười");

    }
}
