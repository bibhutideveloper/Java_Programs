package arrayListJava;
import java.util.Scanner;

// import ArrayList class
// it is a inbuilt class
import java.util.ArrayList;

public class ArrayListExample {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// create ArrayList object
		ArrayList<String> stuName = new ArrayList<String>();
		
		
		
		for(int i=0; i<5; i++) {
			System.out.print("Enter item: ");
			String str = sc.next();
			stuName.add(str);
		}
		
		System.out.println(stuName);
		
//		// to add elements : use method 'add()'
//		stuName.add("Bibhuti");
//		stuName.add("Kunal");
//		stuName.add("Sachin");
//		
//		System.out.println(stuName);
//		
//		// Access elements in ArrayList using index value
//		System.out.println(stuName.get(0));
//		System.out.println(stuName.get(1));
//		System.out.println(stuName.get(2));
//		
//		// Access elements in ArrayList using loop
//		System.out.println("\nAccess elements in ArrayList using loop");
//		for(int i=0; i<stuName.size(); i++) {
//			System.out.println(stuName.get(i));
//		}
//		
//		System.out.println("\nAccess elements in ArrayList using For each loop");
//		for(String arr : stuName) {
//			System.out.println(arr);
//		}
//		
//		 ArrayList<Object> arr2 = new ArrayList<Object>();    
//			 arr2.add("Hello");
//			 arr2.add(21212);
//			 arr2.add(11122.33);    
//			 System.out.println(arr2);
		
		
		
		// to update existing element [index_value, "Updated_value"]
		stuName.set(0,"ABC");
		
		
		// to remove existing element [index_value]
		stuName.remove(2);
		
		// remove all elements at once use 'clear()'
//		stuName.clear();
	}

}
