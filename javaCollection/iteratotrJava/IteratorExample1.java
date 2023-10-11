package iteratotrJava;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Bibhuti");
		a1.add("Suraj");
		a1.add("Abhi");
		a1.add("Kamal");
		a1.add("Raju");
		
		// object for iterator class
		Iterator<String> it = a1.iterator();
		
		// print the first data
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("---------------");
		
		// loop
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
