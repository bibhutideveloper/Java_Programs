package interfaceCode;

interface Drawable{
	void draw();
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("This is a circle.");
	}
}
class Rectangle implements Drawable{
	public void draw() {
		System.out.println("This is a rectangle.");
	}
}
class Triangle implements Drawable{
	public void draw() {
		System.out.println("This is a triangle.");
	}
}

public class Task {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
	}

}
