package linkedListJava;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListTask {

	public static void main(String[] args) {
		LinkedList<Integer> number = new LinkedList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		
		// 1. Write a Java program to append the specified element to the 
		//	end of a linked list.
		number.addLast(50);
		
		// 2. Write a Java program to iterate through all elements in a linked list.
		for(int i:number) {
			System.out.println(i);
		}
		
		// 3. Write a Java program to iterate a linked list in reverse order.
		Collections.reverse(number);
		System.out.println("Reverse:");
		for(int i:number) {
			System.out.println(i);
		}
		
		//4. Write a Java program to insert the specified element at the specified position in the linked list.
		number.add(2, 90);
		System.out.println(number);
		
		// 5. Write a Java program to remove the first and last elements from a linked list.
		number.removeFirst();
		number.removeLast();
		System.out.println(number);
		
		// 6. Write a Java program to remove all elements from a linked list.
		number.removeAll(number);
		System.out.println(number);
		
		// 7. Write a Java program to insert some elements at the specified position into a linked list.
		number.add(0, 10);
		number.add(1, 20);
		System.out.println(number);
	}

}
