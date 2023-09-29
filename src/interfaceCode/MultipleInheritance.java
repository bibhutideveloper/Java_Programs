package interfaceCode;

interface Inf1{
	void show1();
}

interface Inf2{
	void show2();
}

class Display implements Inf1, Inf2{
	public void show1(){
		System.out.println("First interface.");
	}
	public void show2() {
		System.out.println("Second interface.");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Display d = new Display();
		d.show1();
		d.show2();
	}

}
