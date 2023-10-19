package exceptionWithMethodOverriding;

class Parent4{
	void show() throws ArithmeticException { // Exception
		System.out.println("parent method");
	}
}

// 2. subclass overridden method declares same exception
public class ExceptionParent2 extends Parent4{ // same exception as Parent class Exception
	void show() throws ArithmeticException{
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		ExceptionParent2 ep = new ExceptionParent2();
		ep.show();
	}

}
