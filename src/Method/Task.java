package Method;
import java.util.Scanner;
public class Task {
	public static void display(int id, String name, String college, Long phone) {
		System.out.println("\n\nDetails of Student");
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("College Name: "+college);
		System.out.println("Phone No.: "+phone);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter College Name: ");
		String college = sc.next();
		
		System.out.println("Enter Phone: ");
		Long phone = sc.nextLong();
		
		display(id, name, college, phone);
		
		sc.close();
	}

}
