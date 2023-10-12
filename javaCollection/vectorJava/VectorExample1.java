package vectorJava;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		
		// insert into Vector
		v1.add(12);
		v1.add(23);
		v1.add(34);
		v1.add(45);
		
		System.out.println(v1);
		
		// loop
		for(int i:v1) {
			System.out.println(i);
		}
		
		// access by index number
		System.out.println("Value at index 2: "+v1.get(2));
		
		// remove by index number
		v1.remove(1);
		System.out.println(v1);
		
		// remove all
		v1.clear();
		System.out.println(v1);
	}

}
