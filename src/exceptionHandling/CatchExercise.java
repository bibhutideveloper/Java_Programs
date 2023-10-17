// Write a java program using multiple catch blocks. 
// Create a class CatchExercise inside the try block declare 
// an array a[] and initialize with value a[5] =30/5; . 
// In each catch block show Arithmetic exception and 
// ArrayIndexOutOfBoundsException. Write finally block .
package exceptionHandling;

public class CatchExercise {

	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[5] = 30/5;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index exception.");
		}
		finally {
			System.out.println("All done.");
		}
	}

}
