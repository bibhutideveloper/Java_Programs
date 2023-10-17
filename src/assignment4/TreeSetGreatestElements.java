// Question 4
package assignment4;
import java.util.TreeSet;

// Base class
public class TreeSetGreatestElements {

	public static void main(String[] args) {
		// Creating TreeSet
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		// Inserting element in TreeSet
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		int element = 30;
		
		// Printing strictly greater than or equal to the given element
		System.out.println("Strictly >= "+element+"\n"+numbers.tailSet(element));
	}

}
