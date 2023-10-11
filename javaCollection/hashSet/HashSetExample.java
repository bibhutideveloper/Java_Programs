package hashSet;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet <String> countries = new HashSet<String>();
		
		countries.add("India");
		countries.add("Japan");
		countries.add("Japan");
		countries.add("Russia");
		countries.add("Russia");
		
		System.out.println(countries);
		
		// size
		System.out.println(countries.size());
		
		// loop
		for(String i:countries) {
			System.out.println(i);
		}
		
		// remove element
		countries.remove("Russia");
		System.out.println(countries);
		
		// remove all objects
		countries.clear();
		System.out.println(countries);
	}

}
