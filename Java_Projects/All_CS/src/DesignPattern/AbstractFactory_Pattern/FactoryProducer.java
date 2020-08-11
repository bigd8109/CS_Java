package DesignPattern.AbstractFactory_Pattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("animal")) {
            return new AnimalFactory();
        }
        else if (type.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
