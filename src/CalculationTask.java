import java.util.Scanner;
import static java.lang.System.*;
public class CalculationTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		System.out.println("Enter Principle: ");
		int p = sc.nextInt();
		System.out.println("Enter Time in Years:");
		int t = sc.nextInt();
		
		double ir;
		double si;
		
		if(p>10000) {
			ir = 10;
//			si=(p*ir*t)/100;
//			System.out.println("Simple Interest: "+si);
		}else if(p>=5000 && p<10000) {
			ir = 8;
//			si=(p*ir*t)/100;
//			System.out.println("Simple Interest: "+si);
		}else {
			ir = 5;
//			si=(p*ir*t)/100;
//			System.out.println("Simple Interest: "+si);
		}
		si=(p*ir*t)/100;
		out.println("Simple Interest: "+si);
	}

}
