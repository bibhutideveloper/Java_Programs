package exceptionHandling;

public class ExceptionNestedTry {

	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block 1
			try {
				// inner try block inside inner try block 1
				try {
					int arr[] = {1,2,3,4};
				}
				// catch block to handle arithmetic
				catch(ArithmeticException e) {
					System.out.println("Arithmetic Exception.");
					System.out.println("try block inside inner block 1.");
				}
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception.");
				System.out.println("inner try block 1.");
			}
		}
		// outer catch block 1
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Parent Exception.");
			System.out.println("Handled by outer try-catch.");
		}
	}

}
