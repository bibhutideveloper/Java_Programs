package Method;

public class Method4 {
	public int addition() {
		int a = 20;
		int b = 10;
		return a+b;
	}
	
	public int subtraction() {
		int a = 20;
		int b = 10;
		return a-b;
	}
	
	public int multiplication() {
		int a = 20;
		int b = 10;
		return a*b;
	}
	
	public int division() {
		int a = 20;
		int b = 10;
		return a/b;
	}
	
	public int modulus() {
		int a = 20;
		int b = 10;
		return a%b;
	}

	public static void main(String[] args) {
		Method4 m4 = new Method4();
		System.out.println("Addition = "+m4.addition());
		System.out.println("Subtraction = "+m4.subtraction());
		System.out.println("Multiplication = "+m4.multiplication());
		System.out.println("Division = "+m4.division());
		System.out.println("Modulus = "+m4.modulus());
	}

}
