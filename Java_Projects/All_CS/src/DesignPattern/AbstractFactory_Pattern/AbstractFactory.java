package DesignPattern.AbstractFactory_Pattern;
/*In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.
Each generated factory can give the objects as per the Factory pattern.
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories.
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.*/



//public interface AbstractFactory<T>{
//    public T create(String type);
//}

public abstract class AbstractFactory<T extends Object> {
    public abstract T create(String type);
}
