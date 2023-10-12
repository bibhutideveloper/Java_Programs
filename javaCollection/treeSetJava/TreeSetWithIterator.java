package treeSetJava;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetWithIterator {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		
		// insert element
		t1.add(23);
		t1.add(4);
		t1.add(10);
		t1.add(32);
		t1.add(15);
		
		System.out.println("t1: "+t1);
		
		// Loop with iterator
		Iterator<Integer> it = t1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
