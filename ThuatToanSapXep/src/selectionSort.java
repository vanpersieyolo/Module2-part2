import java.util.Scanner;

public class selectionSort {

    private static void nhap_mang(int []A, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            System.out.print("A[ "+i+" ]: ");
            A[i] = scn.nextInt();
        }
    }

    private static void xuat_mang(int []A, int n) {
        for(int i=0; i<n; i++) {
            System.out.println("A[ "+i+" ]: "+A[i]);
        }
    }

    private static void swap(int []A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    private static void selectionSortt(int []A, int n) {
        for(int i=0; i<n-1; i++) {
            int minArr = i;
            for(int j=i+1; j<n; j++) {
                if(A[minArr]>A[j]) {
                    minArr = j;
                }
            }
            if(i!=minArr)
                swap(A, minArr, i);
        }
    }

    public static void main(String[] args) {
        int []A;
        int index=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        index = scn.nextInt();
        A = new int[index];
        nhap_mang(A, index);
        System.out.println("Mảng sau khi sắp xếp (Selection Sort)");
        selectionSortt(A, index);
        xuat_mang(A, index);
    }

}