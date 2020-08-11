package DesignPattern.Observer_Pattern;

public class HexObserver implements Subject.Observer {
    Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("New Hex string: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
