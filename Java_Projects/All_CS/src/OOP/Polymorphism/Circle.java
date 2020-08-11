package OOP.Polymorphism;

public class Circle extends Shape {
	@Override
	public void display() {
		super.display();
		System.out.println("display from Circle");
	}
}
