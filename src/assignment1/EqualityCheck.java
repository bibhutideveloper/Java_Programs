// Question 4
package assignment1;
import java.util.Scanner;
public class EqualityCheck {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Inputs
		System.out.println("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		// Main logic
		if(num1 == num2) {
			System.out.println(num1+" and "+num2+" are equal.");
		}else {
			System.out.println(num1+" and "+num2+" are different.");
		}
	}

}
