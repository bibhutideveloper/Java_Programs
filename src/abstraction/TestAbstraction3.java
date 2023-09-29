package abstraction;

abstract class S1{
	S1(){
		System.out.println("Abstract constructor.");
	}
	abstract void show();
}
class S2 extends S1{
	S2(){
		System.out.println("Child class constructor.");
	}
	void show() {
		System.out.println("Inherited method called.");
	}
}

public class TestAbstraction3 {

	public static void main(String[] args) {
		S2 obj = new S2();
		obj.show();
	}

}
