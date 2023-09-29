package abstraction;

// abstract class with abstract method
// declare method on superclass and define body in subclass
abstract class Abcd{
	// WRONG
//	abstract void show1() {
//		System.out.println("Hello World");
//	}
	

	// CORRECT
	abstract void show();
}

class Efgh extends Abcd{
	void show() {
		System.out.println("Hello World.");
	}
}

public class TestAbstraction2 {

	public static void main(String[] args) {
		Efgh obj = new Efgh();
		obj.show();
	}

}
