package linkedListJava;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Bibhuti");
		name.add("Ajay");
		name.add("Kamal");
		name.add("Ramesh");
		
		System.out.println(name);
		
		// insert at 1sst position
		name.addFirst("Kajal");
		System.out.println(name);
		
		// insert at last position
		name.addLast("Pinki");
		System.out.println(name);
		
		// remove from list
		name.remove("Ajay");
		
		// remove 1st element
		name.removeFirst();
		System.out.println(name);
		
		// remove last element
		name.removeLast();
		System.out.println(name);
		
		// display 1st element		
		System.out.println("First value: "+name.getFirst());
		
		// display last element
		System.out.println("Last value: "+name.getLast());
	}

}
