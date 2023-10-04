package arrayListJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(100);
		number.add(10);
		number.add(10);
		number.add(90);
		number.add(80);
		
		// Sorting element : 1st way
		number.sort(null);
		for(int i:number) {
			System.out.println(i);
		}
		
		// Sorting element : 2nd way using 'Collections' class
		Collections.sort(number);
		for(int i:number) {
			System.out.println(i);
		}
		
		// Searching element
		if(number.contains(10)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}

}
