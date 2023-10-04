package arrayListJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopy {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		// Add demo data to fit the size of ArrayList
		for (int i = 0; i < list1.size(); i++) {
            list2.add(0);
        }
		
		Collections.copy(list2, list1); // [destination, source]

		for(int i:list2) {
			System.out.println(i);
		}
	}

}
