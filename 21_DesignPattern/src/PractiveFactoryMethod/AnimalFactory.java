package PractiveFactoryMethod;

public class AnimalFactory {
    public  Animal getAnimal (String animal ){
        if ("canine".equals(animal)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
