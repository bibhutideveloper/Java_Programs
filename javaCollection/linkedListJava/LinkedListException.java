package linkedListJava;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListException {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many element you want to  store?");
		int count = sc.nextInt();
		
		try {
			for(int i=1; i<=count; i++) {
				System.out.print("Enter element "+i+": ");
				numbers.add(sc.nextInt());
			}
			sc.close();
			
			System.out.println("\nOriginal ArratList:\n"+numbers);
			Collections.sort(numbers, Collections.reverseOrder());
			System.out.println("\nDescending Order ArrayList:\n"+numbers);
		}
		catch(InputMismatchException e) {
			System.out.println("\nIncorrect form of data.\nEnter numbers only.");
		}
		
		
	}

}
