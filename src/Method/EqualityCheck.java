package Method;
import java.util.Scanner;
public class EqualityCheck {
	public void check(int a, int b) {
		if(a==b) {
			System.out.println(a+" and "+b+" are same.");
		}else {
			System.out.println(a+" and "+b+" are different.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		sc.close();
		
		EqualityCheck ec = new EqualityCheck();
		ec.check(a, b);
	}

}
