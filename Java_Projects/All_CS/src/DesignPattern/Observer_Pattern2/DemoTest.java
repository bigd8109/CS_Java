package DesignPattern.Observer_Pattern2;

public class DemoTest {

    public static void main(String[] args) {
        System.out.println("Observer Pattern");

        Subject sub = new Subject();
        HexObserver hexObserver= new HexObserver();
        sub.registerListener(hexObserver);
        OctalObserver octalObserver= new OctalObserver();
        sub.registerListener(octalObserver);

        System.out.println("First state");
        sub.setState(100);

        System.out.println("Second state");
        sub.setState(16);

        System.out.println("Remove listener");
        sub.removeListener(hexObserver);

        System.out.println("Third state");
        sub.setState(45);
    }
}
