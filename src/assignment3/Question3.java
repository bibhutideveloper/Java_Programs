// Question 3
package assignment3;

interface BankAccounts{
	void deposit();
	void withdraw();
}

class CheckingAccounts implements BankAccount{	
	public void deposit(){
		System.out.println("Deposit");
	}
	
	public void withdraw() {
		System.out.println("Withdraw");
	}
}

public class Question3 {

	public static void main(String[] args) {
		CheckingAccounts accountOperation = new CheckingAccounts();
		
		accountOperation.deposit();
				
		accountOperation.withdraw();
	}

}
	