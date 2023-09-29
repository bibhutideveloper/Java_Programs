package myProject;

public class UnaryOperator {

	public static void main(String[] args) {
//		increment operator (++) --> +1
//		decrement operator (--) --> -1
		
		int a = 10;
		System.out.println("post");
		System.out.println("increment operator: "+(a++));
		System.out.println("decrement operator: "+(a--));
		
		System.out.println("pre");
		System.out.println("increment operator: "+(++a));
		System.out.println("decrement operator: "+(--a));
	}

}
