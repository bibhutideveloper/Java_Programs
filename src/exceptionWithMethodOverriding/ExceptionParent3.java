package exceptionWithMethodOverriding;

class Parent5{
	void show() throws Exception { // Exception
		System.out.println("parent method");
	}
}

// 3. subclass overridden method declares no exception
public class ExceptionParent3 extends Parent5{ // same exception as Parent class Exception
	void show(){
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		ExceptionParent3 ep3 = new ExceptionParent3();
		ep3.show();
	}

}
