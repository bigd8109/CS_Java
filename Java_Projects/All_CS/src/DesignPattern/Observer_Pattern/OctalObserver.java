package DesignPattern.Observer_Pattern;

public class OctalObserver implements Subject.Observer {
    Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("New Octal string: " + Integer.toOctalString(subject.getState()).toUpperCase());
    }
}
