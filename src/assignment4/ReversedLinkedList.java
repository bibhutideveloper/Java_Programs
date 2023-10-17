// Question 2
package assignment4;
import java.util.Iterator;
import java.util.LinkedList;

// Base class
public class ReversedLinkedList {

	public static void main(String[] args) {
		// Creating ArrayList
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		// Inserting element in an linkedList
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Default order:\n"+numbers);
		// Creating iterator object to perform reverse order
		Iterator<Integer> desc = numbers.descendingIterator();
		System.out.println("Reverse Order:");
		
		// Logic for printing reverse order
		while(desc.hasNext()) {
			System.out.println(desc.next());
		}
	}

}
