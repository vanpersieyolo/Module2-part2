package Practive1;

import java.util.Random;

public class Car implements Runnable {
    String nameCar;
    public Car (String nameCar){
        this.nameCar = nameCar;
    }
    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < Main.DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);
                runDistance+=speed;
                String log = " | ";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.nameCar + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Car" + this.nameCar + " broken...");
                break;
            }
        }
    }
}
