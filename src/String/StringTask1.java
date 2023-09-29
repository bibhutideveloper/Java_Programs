package String;
import java.util.Scanner;
public class StringTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line.");
		String s1 = sc.nextLine();
		
		System.out.println("Index of b = "+s1.indexOf('b'));
		
		System.out.println("Which word you want to replace?");
		String rep1 = sc.nextLine();
		System.out.println("With which word?");
		String rep2 = sc.nextLine();
		System.out.println("Before replace: "+s1);
		System.out.println("After replace: "+s1.replace(rep1, rep2));
		
		sc.close();
	}

}
