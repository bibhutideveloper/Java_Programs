package exceptionHandling;

public class ExceptionMultiCatch {

	public static void main(String[] args) {
		try {
			// index: 0 1 2 3 4
			int[] arr = new int[5];
			
			// Excp1: array index
			// Excp2: arithmetic
			arr[5]=20/0;
		}		
		catch(ArithmeticException e) { // Specific
			System.out.println("Arithmetic exception occured.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Araay index exception.");
		}
		catch(Exception e) { // General
			System.out.println("Parent exception.");
		}
		System.out.println("Remaining code.");
	}

}
