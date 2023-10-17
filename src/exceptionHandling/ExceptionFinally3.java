//Case3: When an exception occurs and is handled by the catch block
package exceptionHandling;

public class ExceptionFinally3 {

	public static void main(String[] args) {
		try {
			int result = 36/0;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled:\n"+e);
		}
		finally {
			System.out.println("finally block executed");
		}
		
		System.out.println("remaining code");
	}

}
