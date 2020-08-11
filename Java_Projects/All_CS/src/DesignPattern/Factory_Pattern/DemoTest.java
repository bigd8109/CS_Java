package DesignPattern.Factory_Pattern;

/*In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.*/

public class DemoTest {
    public static void main (String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.getAnimal("dog");
        Animal cat = factory.getAnimal("cat");
        dog.bark();
        cat.bark();
    }
}
