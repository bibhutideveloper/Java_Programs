package hashMapJava;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "Red");
		h.put(2, "White");
		h.put(3, "Green");
		h.put(4, "Blue");
		h.put(5, "Yellow");
		
		for(Map.Entry x:h.entrySet()) {
			System.out.println("Key:"+x.getKey()+" Value:"+x.getValue());
		}
	}	

}
