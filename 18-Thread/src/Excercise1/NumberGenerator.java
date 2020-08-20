package Excercise1;

public class NumberGenerator  extends Thread{
    @Override
    public void run() {
        int count = 0;
        try{
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
