// no argument no return
package Method;
import java.util.Scanner;

public class Type1 {
	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int tmp = num;
		int length = String.valueOf(num).length();
		double sum = 0;
		
		for(int i=1; i<=length; i++) {
			int r = num%10;
			num = num/10;
            sum = sum+(Math.pow(r,length));
		}
		if(sum==tmp) {
			System.out.println("Armstrong.");
		}else {
			System.out.println("Not Armstrong.");
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		check();
	}

}
