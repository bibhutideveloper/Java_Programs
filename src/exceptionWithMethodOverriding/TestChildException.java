package exceptionWithMethodOverriding;

import java.io.IOException;
// If the superclass method does not declare an exception
// Rule1: if the superclass method does not declare an exception
// subclass overridden method cannot declare the checked exception

class Parent{
	void show() {
		System.out.println("Parent method.");
	}
}

public class TestChildException extends Parent{
	void show() throws IOException{
		System.out.println("TestChildException");
	}
	public static void main(String args[]) {
		TestChildException tce = new TestChildException();
		tce.show();
	}
}
