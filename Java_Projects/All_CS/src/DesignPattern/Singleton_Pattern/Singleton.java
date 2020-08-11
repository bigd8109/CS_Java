package DesignPattern.Singleton_Pattern;

public class Singleton {
    private static Singleton obj = null;

    public void printText() {
        System.out.println("Test");
    }

    public static Singleton getInstance() {
        if (null == obj) {
            System.out.println("New instance");
            obj = new Singleton();
        }
        return obj;
    }

}
