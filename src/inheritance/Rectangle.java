package inheritance;

public class Rectangle extends Shape{
	void show2() {
		System.out.println("This is a rectangle shape.");
	}
}

class Square extends Rectangle{
	void show3(){
		System.out.println("Square is a rectangle.");
	}
}
