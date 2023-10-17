// Question 3
package assignment4;
import java.util.HashSet;

// Base class
public class NoOfElementHashSet {

	public static void main(String[] args) {
		// Creating HashSet
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		// Inserting element in HashSet
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		// Calculating size of HashSet and displaying
		System.out.println("Total no. of elements: "+numbers.size());
	}

}
