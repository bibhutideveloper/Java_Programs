//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
package assignment5;
import java.util.Scanner;

// Base class
public class OddException {
	// Method to check whether the number is +ve or -ve
	public void checkOddEven(int number) {
		// Logic to check +ve or -ve
		if(number%2 == 0) {
			// try-catch block to handle exception
			try {
				throw new ArithmeticException(number+" is EVEN.");
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println(number+" is ODD.");
		}
	}
	
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		// User input
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		// Object of the class
		OddException check = new OddException();
		// Calling method with argument
		check.checkOddEven(number);
	}
}

/*	OUTPUT
	
	Case: 1
	Enter a number: 
	22
	22 is EVEN.
	
	Case: 2
	Enter a number: 
	11
	11 is ODD.
 */