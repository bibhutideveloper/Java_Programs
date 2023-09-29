package Method;
import java.util.Scanner;
public class AlphabetCheck {
	public void check(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphabet: ");
		char ch = sc.next().charAt(0);
		
		AlphabetCheck ac = new AlphabetCheck();
		ac.check(ch);
		
		sc.close();
	}

}
