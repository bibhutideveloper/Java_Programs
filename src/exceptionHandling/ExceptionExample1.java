package exceptionHandling;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println("Div: "+(a/b));
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		System.out.println("Subtract: "+(a-b));
	}

}
