package hashMapJava;
import java.util.HashMap;

public class HashMapExample5 {

	public static void main(String[] args) {
			HashMap<Integer, String> h = new HashMap<Integer, String>();
			h.put(2, "Green");
			h.put(1, "Red");
			h.put(5, "Blue");
			System.out.println(h);
			
			if(h.containsKey(2)) {
				System.out.println("Data Found");
			}else {
				System.out.println("Data Not Found.");
			}
	}

}
