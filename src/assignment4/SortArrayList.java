// Question 1
package assignment4;
import java.util.ArrayList;
import java.util.Collections;

// Base class
public class SortArrayList {

	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Inserting element in an ArrayList
		numbers.add(20);
		numbers.add(40);
		numbers.add(30);
		numbers.add(50);
		numbers.add(10);
		System.out.println("Before Sort:\n"+numbers);
		
		// Using Collections class and sort method to sort an ArrayList
		Collections.sort(numbers);
		System.out.println("After sort:\n"+numbers);
		
	}

}
