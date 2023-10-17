// Question 6
package assignment4;
import java.util.HashMap;

// Base class
public class HashMapCopy {

	public static void main(String[] args) {
		// Creating HashMap
		HashMap<Integer, String> numbers = new HashMap<Integer, String>();
		
		// Inserting elements into HashMap
		numbers.put(1, "Apple");
		numbers.put(2, "mango");
		numbers.put(3, "Pineapple");
		numbers.put(4, "Grapes");
		numbers.put(5, "Guava");

		// Displaying original HashSet
		System.out.println("Original HashSet:\n"+numbers);
		
		// Creating second HashMap to copy elements
		HashMap<Integer, String> numbersCopy = new HashMap<Integer, String>();
		
		// Copying HashSet
		numbersCopy.putAll(numbers);
		// Displaying Copy HashSet
		System.out.println("\nCopy HashSet:\n"+numbersCopy);
	}

}
