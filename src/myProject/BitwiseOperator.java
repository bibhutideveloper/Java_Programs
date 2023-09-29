package myProject;

public class BitwiseOperator {

	public static void main(String[] args) {
		// and ( & )
		// or  ( | )
		// xor ( ^ )  -->  same bits = 0, differenr bits = 1
			
		int a = 5;
		int b = 3;
		System.out.println(a & b);	// 1
		System.out.println(a | b);	// 7
		System.out.println(a ^ b);	// 6
		
		System.out.println("---------------");
		
		int x = 4;
		int y = 6;
		System.out.println(x & y);	// 4
		System.out.println(x | y);	// 6
		System.out.println(x ^ y);	// 2
	
		System.out.println("---------------");
		
		int s = 8;
		int t = 11;
		System.out.println(s & t);	// 
		System.out.println(s | t);	// 
		System.out.println(s ^ t);	// 

		System.out.println("---------------");
		
//		left shift and right shift
		int q = 5;
		int r = 2;
		System.out.println(q<<r);	// 20
		System.out.println(q>>r);	// 1
	}

}
