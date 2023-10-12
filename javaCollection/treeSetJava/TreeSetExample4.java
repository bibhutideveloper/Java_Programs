package treeSetJava;

import java.util.TreeSet;

public class TreeSetExample4 {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(23);
		t1.add(21);
		t1.add(10);
		t1.add(32);
		t1.add(15);
		System.out.println("t1: "+t1);
		
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(10);
		t2.add(21);
		System.out.println("t2: "+t2);
		
		// Subset or not ?
		System.out.println("Is t2 subset of t1? "+t1.containsAll(t2));
		
		// containsAll() returns boolean value.
		
		if(t1.containsAll(t2)) {
			System.out.println("t2 is subset of t1.");
		}else {
			System.out.println("t2 is not a subset of t1.");
		}
	}

}
