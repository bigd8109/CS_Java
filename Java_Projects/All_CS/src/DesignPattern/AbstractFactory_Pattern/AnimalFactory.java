package DesignPattern.AbstractFactory_Pattern;

public class AnimalFactory extends AbstractFactory<Animal>{
    @Override
    public Animal create(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}
