package PractiveFactoryMethod;

public class Dog extends Animal{
    @Override
    public String makeSound() {
        return "Go Go";
    }
    public String run(){
        return "run";
    }
}
