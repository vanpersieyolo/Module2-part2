package PractiveFactoryMethod;

public class Show {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println(a1.makeSound());
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println(a2.makeSound());

    }
}
