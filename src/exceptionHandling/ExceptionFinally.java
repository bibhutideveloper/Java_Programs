//Case1: When an exception does not occur
package exceptionHandling;

public class ExceptionFinally {

	public static void main(String[] args) {
		try {
			int result = 36/6;
			System.out.println(result);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally block executed");
		}
		
		System.out.println("remaining code");
	}

}
