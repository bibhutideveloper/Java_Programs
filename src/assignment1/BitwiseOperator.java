// Question 3
package assignment1;
import java.util.Scanner;
public class BitwiseOperator {		// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Inputs
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();
		
		sc.close();
		
		// Operations done by bitwise operator
		// 1. Bitwise AND
		System.out.println("Bitwise AND Result: "+(a&b));
		// 2. Bitwise OR
		System.out.println("Bitwise OR Result: "+(a|b));
		// 3. Bitwise XOR
		System.out.println("Bitwise XOR Result: "+(a^b));
		// 4. Bitwise Left Shift
		System.out.println("Bitwise Left Shift Result: "+(a<<b));
		// 4. Bitwise Right Shift
		System.out.println("Bitwise Right Shift Result: "+(a>>b));
	}

}
