// Question 4
package assignment2;
import java.util.Scanner;
public class PrimeCheck {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// User Input
		System.out.println("Ente a number: ");
		int n = sc.nextInt();
		int count = 0;
		
		sc.close();
		
		// main Logic
		if(n<=1) {
			System.out.println("Not Prime");
		}else {
			for(int i=2; i<n; i++) {
				if(n%i == 0) {
					count++;
				}
			}
			
			if(count==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prine");
			}
		}
	}

}
