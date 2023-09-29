// Question 3
package assignment3;
import java.util.Scanner;

// Interface with methods to be implemented
interface BankAccount{
	void deposit();
	void withdraw();
}

// class implementing interface and defining methods of that interface
class CheckingAccount implements BankAccount{
	// Scanner object
	Scanner sc = new Scanner(System.in);
	
	// Demo total amount to perform operations
	double totalAmount = 10000;
	
	// Method to deposit amount
	public void deposit(){
		// User Input: to deposit amount
		System.out.println("Enter amount to deposit: ");
		double depositAmount = sc.nextDouble();
		
		// Amount deposit calculation and printing
		totalAmount += depositAmount;
		System.out.println("Total amount after deposit:\n"+totalAmount);
	}
	
	// Method to withdraw amount
	public void withdraw() {
		// User Input: to withdraw amount
		System.out.println("\n\nEnter amount to withdraw: ");
		double withdrawnAmount = sc.nextDouble();
		
		// Amount withdraw calculation and printing
		totalAmount -= withdrawnAmount;
		System.out.println("Total amount after withdrawn:\n"+totalAmount);
	}
}

// Base class having driver code in main methods
public class BankSystem {

	public static void main(String[] args) {
		// creating object for class 'CheckingAccount' to call methods
		CheckingAccount accountOperation = new CheckingAccount();
		
		// Calling method to deposit money
		accountOperation.deposit();
				
		// Calling method to withdraw money
		accountOperation.withdraw();
	}

}


/*  OUTPUT*/

//	Enter amount to deposit: 
//	1000
//	Total amount after deposit:
//	11000.0
//
//
//	Enter amount to withdraw: 
//	2000
//	Total amount after withdrawn:
//	9000.0

