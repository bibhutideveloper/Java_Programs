package arrayListJava;
import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("red");
		color.add("blue");
		color.add("green");		
		color.add(0, "yellow");
		
		System.out.println("All color: ");
		for(String str:color) {
			System.out.println(str);
		}
		
		System.out.println("\n3rd index color: "+color.get(3));
		
		color.set(0, "orange");
		System.out.println("\nAfter updation\nAll color: ");
		for(String str:color) {
			System.out.println(str);
		}
		
	}

}
