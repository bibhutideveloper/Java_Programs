package abstraction;

// abstract class with non-abstract method
abstract class Abc{
	void show1() {
		System.out.println("Abstract class method.");
	}
}

class Xyz extends Abc{
	void show2() {
		System.out.println("Child class method.");
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		// Abc obj = new Abc();
		Xyz obj = new Xyz();
		obj.show1();
		obj.show2();
	}

}
