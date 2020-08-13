package Test;

import java.util.Random;

public class DemoQuick {

    public static void main(String[] args) {
        Random random = new Random();
         int[] arrayRandom = new int[10];
            for (int i = 0; i <10 ; i++) {
                arrayRandom[i] = random.nextInt(20);
                System.out.print(arrayRandom[i]+" ");
            }
    }
}
