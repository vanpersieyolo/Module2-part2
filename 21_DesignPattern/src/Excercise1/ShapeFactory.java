package Excercise1;

public class ShapeFactory{
    public Shape getShape(String a ){
        if ("circle".equals(a)){
            return new Circcle();
        }else if ("square".equals(a)){
            return new Square();
        }if ("rectangle".equals(a)){
            return new Rectangle();
        }
        return null;
    }
}
