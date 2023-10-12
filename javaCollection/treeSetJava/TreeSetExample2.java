package treeSetJava;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(9);
		t.add(45);
		t.add(12);
		t.add(90);
		t.add(78);
		t.add(34);
		t.add(89);
		
		System.out.println(t);
		
		// Higher element
		System.out.println("Higher(): "+t.higher(45));
		System.out.println("Higher(): "+t.higher(90));
		
		// Lower element
		System.out.println("Lower(): "+t.lower(45));
		System.out.println("Lower(): "+t.lower(9));
		
		// Higher and lower returns multiple values
		// it set a limit
		System.out.println("headSet(): "+t.headSet(45));
		System.out.println("headSet(): "+t.headSet(45,true));
		System.out.println("tailSet(): "+t.tailSet(45));
		System.out.println("tailSet(): "+t.tailSet(45,false));
	}

}
