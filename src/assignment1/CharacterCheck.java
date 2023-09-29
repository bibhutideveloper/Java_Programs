// Question 2
package assignment1;
import java.util.Scanner;
public class CharacterCheck {	// Base class

	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		sc.close();
		
		// Main Logic
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {	// Alphabet Check Logic
			System.out.println("This is an alphabet.");
		}else if(ch>='0' && ch<='9') {						// Digit Check Logic
			System.out.println("This is a digit.");
		}else {
			System.out.println("This is a special character.");
		}
	}

}
