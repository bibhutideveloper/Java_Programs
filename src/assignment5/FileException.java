//3. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
package assignment5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;	

// Base class
public class FileException {
	// Method to read file including exception handling during method call
	// String fileName: It contains the address of file we passed in readFile() method call
	static void readFile(String fileName) throws FileNotFoundException, PositiveException {
		// Using FileInputStream to deal with file by creating object
		FileInputStream file = new FileInputStream(fileName);
		// Scanner object: Important role; to use hasNextLine() an nextLine() method
		Scanner sc = new Scanner(file);
		// calling method with the object as an argument to check the numbers available in the file with iteration
		checkNumber(sc);
	}

	// Method to check each number with handling the exception during method call
	static void checkNumber(Scanner sc) throws PositiveException {
		// variable to throw exception according the the condition
		boolean containsPositive = false;
		// Loop to iterate through each line
		while(sc.hasNextLine()){
			// Contains a number(in String form) to check +ve or -ve
			String number = sc.nextLine();
			// Converting String into an Integer and checking
			if(Integer.parseInt(number)>0) {
				// This will be true if any number is +ve
				containsPositive = true;
				break;
			}
		}
		sc.close();
		
		// This statement will throw exception according to the condition with the help of variable 'containsPositive'
		if(containsPositive) {
			throw new PositiveException("File contains positive numbers.");
		}else {
			throw new PositiveException("File doesn't contains positive numbers.");
		}
	}

	public static void main(String[] args) {
		// try-catch block to handle exception
		try {
			// method to read a file: passing file address as an argument in String form
			readFile("F://file_handling/numbers.txt");
		}catch(Exception e){
			// This will print exception message according to the requirement(if-else block)
			System.out.println(e.getMessage());
		}
	}
}

// Creating custom Exception class to handle the exceptions
@SuppressWarnings("serial")
class PositiveException extends Exception{
	public PositiveException(String message) {
		super(message);
	}
}

/*		Case: 1
		[ File Data ]
		-1
		-2
		
		OUTPUT:
		File doesn't contains positive numbers.


		case: 2
		[ File Data ]
		1
		2
		
		OUTPUT:
		File contains positive numbers.
		
		
		case: 3
		[ File Data ]
		-1
		-2
		3
		
		OUTPUT:
		File contains positive numbers.
*/