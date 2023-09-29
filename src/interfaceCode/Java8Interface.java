package interfaceCode;

// We cannot define method body in interface but
// We can define a default method inside interface.
// It was introduced in Java-8

interface Sample{
	void show();
	default void display() {
		System.out.println("Default method for interface.");
	}
}

class SubSample implements Sample{
	public void show(){
		System.out.println("Normal method.");
	}
}

public class Java8Interface {

	public static void main(String[] args) {
		SubSample ss = new SubSample();
		ss.show();
		ss.display();
	}

}
