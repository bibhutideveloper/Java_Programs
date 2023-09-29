package abstraction;

abstract class Shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends Shape{
	int r = 4;
	void calculateArea() {
		System.out.println("Circle Area: "+(3.14*r*r));
	}
	void calculatePerimeter() {
		System.out.println("Circle Perimeter: "+(2*3.14*r));
	}
}

class Triangle extends Shape{
	int b = 5;
	int h = 7;
	int s1 = 2;
	int s2 = 5;
	int s3 = 4;
	void calculateArea() {
		System.out.println("Triangle Area: "+(1/2*(b*h)));
	}
	void calculatePerimeter() {
		System.out.println("Triangle Perimeter: "+(s1+s2+s3));
	}
}

public class Task {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		
		Triangle t = new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}

}
