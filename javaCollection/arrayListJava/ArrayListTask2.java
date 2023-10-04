package arrayListJava;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask2 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Bibhuti");
		name.add("Abhishek");
		name.add("Rajesh");
		name.add("Dinesh");
		name.add("Sanjay");
		name.add("Abhishek");
		name.add(0, "Ashish");
		
		System.out.println("Array list:\n "+name);
		
		name.remove(4);
		System.out.println("After removing element:\n "+name);
		
		Collections.sort(name);
		System.out.println("Sorted Array list:\n"+name);
		
		Collections.reverse(name);
		System.out.println("Reversed Array list:\n"+name);
		
		name.set(3, "XYZ");
		System.out.println("New Array list:\n"+name);
		
		if(name.contains("Bibhuti")){
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
		
	}

}
