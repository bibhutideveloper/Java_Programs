package hashMapJava;
import java.util.HashMap;

public class HashMapTask {

	public static void main(String[] args) {
		HashMap<String, String> name = new HashMap<String, String>();
		
//		1. create a HashMap having 5 objects and its key value should be of same type(String).
		name.put("a","Bibhuti");
		name.put("b","Akash");
		name.put("c","Ramesh");
		name.put("d","Suraj");		
		System.out.println(name);
		
//		2. Write a Java program to get the value of a specified key in a map.
		System.out.println(name.get("c"));
		
//		3. Write a Java program to get a set view of the keys contained in this map.
		for(String i:name.keySet()) {
			System.out.println("Key:"+i);
		}
		
//		4. Write a Java program to get a collection view of the values contained in this map.
		for(String i:name.values()) {
			System.out.println("value:"+i);
		}
	}

}
