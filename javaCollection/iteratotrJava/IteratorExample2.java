package iteratotrJava;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
	
		// Method 1 : for loop
//		for(int i=numbers.size()-1; i>=0; i--) {
//			if(numbers.get(i)<10) {
//				numbers.remove(i);
//			}
//		}
//		System.out.println(numbers);
		
		// Method 2 : for each loop
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		for(int i:numbers) {
//			if(i>=10) {
//				numbers2.add(i);
//			}
//		}
//		System.out.println(numbers2);
		
		// Method 3 : iterator
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i<10) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
