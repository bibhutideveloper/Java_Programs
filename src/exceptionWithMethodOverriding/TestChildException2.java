package exceptionWithMethodOverriding;
// If the superclass method does not declare an exception
// Rule2: if the superclass method does not declare an exception, 
// subclass overridden method cannot declare the checked exception,
// but unchecked exception can be declared.
class Parent2{
	void show() {
		System.out.println("parentc class method");
	}
}
public class TestChildException2 extends Parent {
	void show() throws ArithmeticException {
		System.out.println("TestChildException2");
	}
	
	public static void main(String[] args) {
		TestChildException2 tce2 = new TestChildException2();
		tce2.show();
	}

}
	