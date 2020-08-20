package Excercise1;

import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                String a = scanner.nextLine();
                ShapeFactory shapeFactory = new ShapeFactory();
                Shape shape = shapeFactory.getShape(a);
                shape.draw();
            }catch (Exception e){
                System.out.println("nhập lại di cu");
            }

        }while (true);
    }
}
