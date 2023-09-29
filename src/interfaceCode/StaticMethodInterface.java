package interfaceCode;
// from java-8
// after defining static method inside the interface
// then we have to use interfaceName to call that method
// interfaceName.methodName

interface StaticMethod{
	void show();
	static void display() {
		System.out.println("Static method of intrface.");
	}
}

class SubStaticMethod implements StaticMethod{
	public void show() {
		System.out.println("Normal class method.");
	}
}

public class StaticMethodInterface {

	public static void main(String[] args) {
		SubStaticMethod sm = new SubStaticMethod();
		sm.show();
		
		// calling static method of interface without object
		StaticMethod.display();
	}

}
