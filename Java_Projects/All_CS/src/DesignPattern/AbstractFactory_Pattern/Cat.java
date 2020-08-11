package DesignPattern.AbstractFactory_Pattern;

public class Cat extends Animal {
    @Override
    protected String getType() {
        return "CAT";
    }

    @Override
    protected void makeSound() {
        System.out.println("Cat barks: Meow meow");
    }
}
