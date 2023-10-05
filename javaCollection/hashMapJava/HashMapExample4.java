package hashMapJava;
import java.util.HashMap;

public class HashMapExample4 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(2, "Green");
		h.put(1, "Red");
		h.put(5, "Blue");
		
		boolean result = h.isEmpty();
		System.out.println("Is Map Empty ?\n"+result);
		
		h.clear();
		result = h.isEmpty();
		System.out.println("Is Map Empty ?\n"+result);
	}

}
