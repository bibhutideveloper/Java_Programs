package Scanner;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Division");
		System.out.println("4. Subtraction");
		System.out.println("5. Modulus\n");
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		System.out.println("Choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("Addition = "+(a+b));
			break;
		case 2:
			System.out.println("Multiplication = "+(a*b));
			break;
		case 3:
			System.out.println("Division = "+(a/b));
			break;
		case 4:
			System.out.println("Subtraction = "+(a-b));
			break;
		case 5:
			System.out.println("Modulus = "+(a%b));
			break;
		default:
			System.out.println("Invalid operation choice.");
		}
		sc.close();
	}

}
