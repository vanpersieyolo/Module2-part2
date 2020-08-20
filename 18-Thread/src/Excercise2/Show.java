package Excercise2;

public class Show {
    public static void main(String[] args) {
        OddThread num1 = new OddThread();
        EvenThead num2 = new EvenThead();

        num1.start();
        try{
            num1.join(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num2.start();
    }
}
