// with argument with return value
package Method;
import java.util.Scanner;
public class Type4 {
	public static int check(int num) {
		int tmp = num;
		int length = String.valueOf(num).length();
		double sum = 0;
		
		for(int i=1; i<=length; i++) {
			int r = num%10;
			num = num/10;
            sum = sum+(Math.pow(r,length));
		}
		if(sum==tmp) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if(check(num)==1) {
			System.out.println("Armstrong.");
		}else {
			System.out.println("Not Armstrong.");
		}
	}

}
