//Case2: When an exception occur but not handled by the catch block
package exceptionHandling;

public class ExceptionFinally2 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			System.out.println(arr[10]);
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
