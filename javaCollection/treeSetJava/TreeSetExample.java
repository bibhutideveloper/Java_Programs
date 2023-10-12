package treeSetJava;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		
		// insert element
		t1.add(23);
		t1.add(4);
		t1.add(10);
		t1.add(32);
		t1.add(15);
		
		// by default it display sorted TreeSet
		System.out.println("t1: "+t1);
		
		// 2nd TreeSet
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(10);
		t2.add(4);
		t2.add(21);
		
		System.out.println("t2: "+t2);
		
		// combine two TreeSet : acts as UNION
		// It combine with unique elements(removes duplicate)
		t1.addAll(t2);
		System.out.println("Combined :"+t1);
		
		// Loop with iterator
		Iterator<Integer> it = t1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove element
		t1.remove(23);
		System.out.println("After remove: "+t1);
		
		// access first ad last value
		System.out.println("First: "+t1.first());
		System.out.println("last: "+t1.last());
	}

}
