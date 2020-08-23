package Excercise1;

public class RunProgram  {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();

        num1.start();
        num2.start();

        num1.hashCode();
        num2.hashCode();

        num1.setPriority(Thread.MAX_PRIORITY);
        num2.setPriority(Thread.MAX_PRIORITY);
    }
}
