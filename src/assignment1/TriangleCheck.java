// Question 1
package assignment1;
import java.util.Scanner;
public class TriangleCheck {	// Base class
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Inputs
		System.out.println("Enter 1st side: ");
		int s1 = sc.nextInt();
		System.out.println("Enter 2nd side: ");
		int s2 = sc.nextInt();
		System.out.println("Enter 3rd side: ");
		int s3 = sc.nextInt();
		
		sc.close();
		
		// Main logics
		if(s1==s2 && s2==s3) {	// Equilateral Triangle Logic
			System.out.println("This is an Equilateral Triangle");
		}else if(s1==s2 || s2==s3 || s3==s1) {	// Isosceles Triangle Logic
			System.out.println("This is an Isosceles Triangle");
		}else {
			System.out.println("This is an Scalane Triangle");
		}
	}
}
