package OOP.Polymorphism;

public class Square extends Shape {
	@Override
	public void display() {
		super.display();
		System.out.println("display from Square");
	}
}
