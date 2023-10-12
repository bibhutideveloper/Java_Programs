package treeSetJava;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTask {

	public static void main(String[] args) {
		TreeSet<String> color = new TreeSet<String>();
		
		color.add("Red");
		color.add("Pink");
		color.add("Yellow");
		color.add("White");
		color.add("Blue");
		
//		1. Write a Java program to create a tree set, 
//		add some colors (strings) and print out the tree set
		System.out.println("TreeSet:\n"+color);
		
//		2. Write a Java program to iterate through all elements in 
//		a tree set.
		System.out.println("\n--Using for each loop--");
		for(String i:color) {
			System.out.println(i);
		}

		System.out.println("\n--Using Iterator--");
		Iterator<String> it = color.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		3. Write a Java program to create a reverse order view of 
//		the elements contained in a given tree set.
		Iterator<String> desc = color.descendingIterator();
		System.out.println("\n--Reverse Order--");
		while(desc.hasNext()) {
			System.out.println(desc.next());
		}
	}

}
