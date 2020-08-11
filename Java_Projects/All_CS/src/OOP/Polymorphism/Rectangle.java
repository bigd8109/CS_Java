package OOP.Polymorphism;

public class Rectangle extends Shape {
	@Override
	public void display() {
		super.display();
		System.out.println("display from Rectangle");
	}
}
