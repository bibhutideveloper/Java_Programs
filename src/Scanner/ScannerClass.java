package Scanner;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter roll number: ");
		int num =  sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.println(num);
		System.out.println(name);
		
		sc.close();
	}

}
