package treeSetJava;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(23);
		t1.add(4);
		t1.add(10);
		t1.add(32);
		t1.add(15);
		System.out.println("t1: "+t1);
		
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(10);
		t2.add(4);
		t2.add(21);
		System.out.println("t2: "+t2);
		
		// Difference : t1 minus t2
		t1.removeAll(t2);
		System.out.println("Difference: "+t1);
		
		// Union
		t1.addAll(t2);
		System.out.println("Union: "+t1);
		
		// Intersection
		t1.retainAll(t2);
		System.out.println("Intersection: "+t1);
		

	}

}
