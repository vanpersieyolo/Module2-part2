package Practive1;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 5;

    public static void main(String[] args) {
        Car car = new Car("A");
        Car car1 = new Car("B");
        Car car2 = new Car("C");

        Thread thread = new Thread(car);
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        System.out.println("Distance: 100km");
        thread.start();
        thread1.start();
        thread2.start();
    }

}
