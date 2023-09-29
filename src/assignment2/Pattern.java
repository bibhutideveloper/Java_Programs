// Question 1
package assignment2;
import java.util.Scanner;
public class Pattern {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Input for size of pattern
		System.out.println("Enter size of pattern: ");
		int n = sc.nextInt();
		
		sc.close();
		
		// Main logic
		for(int row=1; row<=n; row++) { // Creating Rows
			for(int col=1; col<=row; col++) { // Creating Columns
				System.out.print("*");
			}
			System.out.println(); // Moving cursor to next line after printing each row
		}
	}

}
