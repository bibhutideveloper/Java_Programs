// Question 5
package assignment1;
import java.util.Scanner;
public class LargestNumber {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Inputs
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int c = sc.nextInt();
		
		sc.close();
		
		// Main Logic
		System.out.println((a>b) ? ((b>c)?a:(c>a)?c:a) : (b>c)?b:c);
	}

}
