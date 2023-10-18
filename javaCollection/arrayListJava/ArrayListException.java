package arrayListJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListException {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		ArrayList<Integer> list2 = 
				new ArrayList<Integer>(Collections.nCopies(list1.size(), null));
		try {
			Collections.copy(list2, list1);
		}
		catch(Exception e) {
			System.out.println("Cannot copy");
		}
		finally {
			System.out.println("list1: "+list1+"\nlist2: "+list2);
		}
	}

}
