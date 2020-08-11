package DesignPattern.AbstractFactory_Pattern;


public class Dog extends Animal {
    @Override
    protected String getType() {
        return "DOG";
    }

    @Override
    protected void makeSound() {
        System.out.println("Dog barks: Go Go");
    }
}
