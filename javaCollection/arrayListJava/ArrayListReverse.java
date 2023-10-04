package arrayListJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		
		Collections.reverse(number);
		System.out.println(number);
	}

}
