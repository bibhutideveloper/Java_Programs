// Question 5
package assignment4;
import java.util.PriorityQueue;

// Base class
public class RetrieveRemovePriorityQueue {

	public static void main(String[] args) {
		// Creating PriorityQueue
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		// Printing original queue
		System.out.println("Original Queue: "+numbers);
		
		// retrieve and remove with a single statement
		System.out.println("Retrieve: "+numbers.poll());
		System.out.println("After removing: "+numbers);
		
		// Additional
		// Retrieving first element separately
		System.out.println(numbers.peek());
		
		// Removing first element separately
		numbers.remove();
		System.out.println(numbers);
	}

}
