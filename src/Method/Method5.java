package Method;
import java.util.Scanner;
public class Method5 {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int mod(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b= sc.nextInt();
		sc.close();
		
		Method5 m5 = new Method5();
		System.out.println("Addition= "+m5.add(a, b));
		System.out.println("Subtraction= "+m5.sub(a, b));
		System.out.println("multiplication= "+m5.mul(a, b));
		System.out.println("Division= "+m5.div(a, b));
		System.out.println("Modulus= "+m5.mod(a, b));
	}

}
