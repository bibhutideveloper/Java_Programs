package hashMapJava;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		
		// to insert values in HashMap
		name.put(101, "Bibhuti");
		name.put(102, "Akash");
		name.put(103, "Ramesh");
		name.put(103, "Suraj");
		
		System.out.println(name);
		
		System.out.println(name.size());
		
		// to access element 
		System.out.println(name.get(101));
		
		// display keys
		for(int i:name.keySet()) {
			System.out.println(i);
		}
		
		// display values
		for(String i:name.values()) {
			System.out.println(i);
		}
		
		// display key and value together
		for(int i:name.keySet()) {
			System.out.println("Key:"+i+" Value:"+name.get(i));
		}
		
		// to remove element
		name.remove(102);
		System.out.println(name);
		
		name.remove(103, "Ramesh");
		System.out.println(name);
		
		// remove all data
		name.clear();
		System.out.println(name);
	}

}
