package ControlFlow;

public class Range {

	public static void main(String[] args) {
		int num = 459;
		
		if(num>=1 && num<=100) {
			System.out.println("range: 1 to 100");
		}
		else if(num>=101 && num<=200) {
			System.out.println("range: 101 to 200");
		}
		else if(num>=201 && num<=300) {
			System.out.println("range: 201 to 300");
		}
		else{
			System.out.println("Out of range.");
		}
	}

}
