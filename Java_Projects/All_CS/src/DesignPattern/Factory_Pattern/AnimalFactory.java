package DesignPattern.Factory_Pattern;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if (type == null)
            return null;
        if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        else if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        }
        return null;
    }
}
