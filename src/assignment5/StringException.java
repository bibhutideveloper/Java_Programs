//4.Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
package assignment5;
import java.util.Scanner;

// Base class
public class StringException {
	// method to check vowel availability in the input including exception handling
	public void checkVowels(String name) throws NoVowelException{
		// Storing vowels in a variable to perform contains() method
		String vowels = "aeiouAEIOU";
		// variable to throw exception according the the condition
		boolean isVowel = false;
		// Loop to iterate through each character of input
		for(int i=0; i<name.length(); i++) {
			// String single character to perform operation
			char character = name.charAt(i);
			// Checking that character is available in vowel variable or not
							   // Converting character to String
			if(vowels.contains(String.valueOf(character))) {
				// This will be true if any character is vowel
				isVowel = true;
				break;
			}
		}
		// This statement will throw exception according to the condition with the help of variable 'isVowel'
		if(!isVowel) {
			throw new NoVowelException("No vowel available.");
		}else {
			throw new NoVowelException("Vowel available.");
		}
	}
	
	public static void main(String[] args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		// User Input
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		sc.close();
		
		// try-catch block to handle exception
		try {
			// Creating object of the class to call method
			StringException check = new StringException();
			// Calling method with argument(user input)
			check.checkVowels(name);
		}catch(NoVowelException e) {
			// This will print exception message according to the requirement(if-else block)
			System.out.println(e.getMessage());
		}
	}
}

//Creating custom Exception class to handle the exceptions
@SuppressWarnings("serial")
class NoVowelException extends Exception{
	public NoVowelException(String message) {
		super(message);
	}
}

/*

	OUTPUT
	
	Case: 1
	Enter your name: 
	bibhuti
	Vowel available.


	Case: 2
	Enter your name: 
	brynn
	No vowel available.

*/