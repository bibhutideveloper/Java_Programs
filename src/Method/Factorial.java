package Method;
import java.util.Scanner;
public class Factorial {
	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numebr: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial= "+fact);
		
		sc.close();
	}

	public static void main(String[] args) {
		factorial();		
	}

}
