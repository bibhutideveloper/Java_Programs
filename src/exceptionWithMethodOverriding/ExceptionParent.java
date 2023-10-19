package exceptionWithMethodOverriding;
// If the superclass method declares an exception
// Rule1: 	If the superclass method declares an exception, 
// subclass overridden method can declare the same subclass exception 
// or no exception but cannot declare parent exception.

class Parent3{
	void show() throws ArithmeticException { // child class of Exception
		System.out.println("parent method");
	}
}

// subclass overridden method declares parent exception
public class ExceptionParent extends Parent3{ // parent class of ArithmeticException
	void show() throws Exception{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		ExceptionParent ep = new ExceptionParent();
		ep.show();
	}

}
