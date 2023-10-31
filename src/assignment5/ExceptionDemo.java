//1. Write a Java program that throws an exception and catch it using a try-catch block.
package assignment5;
import java.util.Scanner;

// Base class
public class ExceptionDemo {
	// Method to divide numbers
	public void divide(int numerator, int denominator) {
		// try-catch block to handle exception
		try {
			// This line may throw exception
			int result = numerator/denominator ;
			System.out.println("Divide: "+result);
		}catch(ArithmeticException e){
			System.out.println("Can't divide by zero.");
		}
	}
	
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		// User Input
		System.out.println("Enter numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter denominator: ");
		int denominator = sc.nextInt();
		
		sc.close();
		
		// Object of the class
		ExceptionDemo ed = new ExceptionDemo();
		// Calling method with object and passing arguments
		ed.divide(numerator, denominator);
	}
}

/*	OUTPUT
	
	[ No Exception ]
	Enter numerator: 
	12
	Enter denominator: 
	4
	Divide: 3


	[ Exception occurs ]
	Enter numerator: 
	12
	Enter denominator: 
	0
	Can't divide by zero.
*/