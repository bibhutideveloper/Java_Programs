package exceptionHandling;

public class ExceptionMultiCatch2 {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e) { // Specific
			System.out.println("Arithmetic exception occured.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // specific
			System.out.println("Araay index exception.");
		}
		catch(Exception e) { // General
			System.out.println("Parent exception.");
		}
		
		System.out.println("Remaining code.");
	}

}
