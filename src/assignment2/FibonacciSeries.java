// Question 3
package assignment2;
import java.util.Scanner;
public class FibonacciSeries {	// Base class

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;
		
		// Scanner ObjectS
		Scanner sc = new Scanner(System.in);
		
		// User Input
		System.out.println("Enter size of series: ");
		int size = sc.nextInt();
		
		sc.close();
		
		// Main Logic
		for(int i=2; i<size; i++) {
			next = first+second;
			System.out.print(next+" ");
			first =second;
			second =next;
		}
	}

}
