package hashMapJava;
import java.util.HashMap;

public class HashMapExample3 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		HashMap<Integer, String> h2 = new HashMap<Integer, String>();
		
		h1.put(1, "Red");
		h1.put(2, "Green");
		h1.put(5, "Blue");
		System.out.println("h1:\n"+h1);
		
		h2.put(4, "Yellow");
		h2.put(3, "White");
		h2.put(6, "Orange");
		System.out.println("\nh2:\n"+h2);
		
		// merge two hash map in h2
		// it will return sorted hashmap 
		h2.putAll(h1);
		System.out.println("\nMerge:\n"+h2);
	}

}
