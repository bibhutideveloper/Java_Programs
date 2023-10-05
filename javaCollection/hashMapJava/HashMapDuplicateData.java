package hashMapJava;
import java.util.HashMap;

public class HashMapDuplicateData {

	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		
		// to insert values in HashMap
		name.put(101, "Bibhuti");
		name.put(102, "Akash");
		name.put(103, "Ramesh");
		name.put(103, "Suraj");
		// this will override the data of same key
		
		System.out.println(name);
		
		
	}

}
