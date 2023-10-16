package exceptionHandling;

public class ExceptionTask {
	public int check(int a, int b){
		try {
			System.out.println("Division: "+(a/b));
		}catch(ArithmeticException e ){
			System.out.println("Can't divide by zero.");
			System.out.println(e.getMessage());
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		ExceptionTask et = new ExceptionTask();
		et.check(a, b);
	}

}
