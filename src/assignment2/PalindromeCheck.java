// Question 5
package assignment2;
import java.util.Scanner;
public class PalindromeCheck {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Inputs
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		sc.close();
		
		int tmp = n;
		int length = String.valueOf(n).length(); // length of number
		int rev = 0;
		
		// Main Logic : Finding Reverse
		for(int i=1; i<=length; i++) {
			int rem = n%10;
			n /= 10;
			rev = rev*10+rem;
		}
		
		// Comparing both value (reverse and original)
		if(tmp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
