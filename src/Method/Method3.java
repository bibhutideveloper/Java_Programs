package Method;
import java.util.Scanner;
public class Method3 {
	void getValue(int n) {
		System.out.println("value of a: "+n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		
		Method2 m2 = new Method2();
		m2.getValue(n);
	}

}
