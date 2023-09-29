package myProject;

public class Swap {

	public static void main(String[] args) {
		//with 3rd variable
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("Before swap: \na = "+a+" \nb = "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After swap: \na = "+a+" \nb = "+b);
		
		//without 3rd variable
		int x = 10;
		int y = 20;
		
		System.out.println("\nBefore swap: \nx = "+x+" \ny = "+y);
		
//		x = x+y;
//		y = x-y;
//		x = x-y;
		
		x = x*y;
		y = x/y;
		x = x/y;
		
		System.out.println("After swap: \nx = "+x+" \ny = "+y);
	}

}
