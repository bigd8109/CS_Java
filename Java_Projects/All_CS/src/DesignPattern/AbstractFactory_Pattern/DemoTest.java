package DesignPattern.AbstractFactory_Pattern;

public class DemoTest {
    public static void main(String[] args) {
        /*AnimalFactory animalFactory = new AnimalFactory();
        ColorFactory colorFactory = new ColorFactory();
        Animal dog = animalFactory.create("dog");
        Animal cat = animalFactory.create("cat");
        dog.makeSound();
        cat.makeSound();
        Color black = colorFactory.create("black");
        Color white = colorFactory.create("white");
        System.out.println(("Color1: " + black.getColor()));
        System.out.println(("Color2: " + white.getColor()));*/

        AnimalFactory animalFactory = (AnimalFactory) FactoryProducer.getFactory("animal");
        ColorFactory colorFactory = (ColorFactory) FactoryProducer.getFactory("color");
        Animal dog = animalFactory.create("dog");
        Animal cat = animalFactory.create("cat");
        dog.makeSound();
        cat.makeSound();
        Color black = colorFactory.create("black");
        Color white = colorFactory.create("white");
        System.out.println(("Color1: " + black.getColor()));
        System.out.println(("Color2: " + white.getColor()));
    }
}
