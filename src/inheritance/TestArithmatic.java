package inheritance;

public class TestArithmatic {

	public static void main(String[] args) {
		Multiplication mul = new Multiplication();
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		Remainder rem = new Remainder();
		
		System.out.println("Multiplication="+mul.calculate());
		System.out.println("Addition="+add.calculate());
		System.out.println("Subtraction="+sub.calculate());
		System.out.println("Remainder="+rem.calculate());
	}

}
