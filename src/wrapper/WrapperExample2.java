package wrapper;

public class WrapperExample2 {

	public static void main(String[] args) {
		Integer a = new Integer(20); // Integer a = 20 [same]
		Integer a2 = 20;
		
		int b = a.intValue(); // explicitly
		int b2 = Integer.valueOf(a); // explicitly
		
		int c = a; // implicitly
		
		System.out.println(a2+" "+b+" "+b2+" "+c);
		
	}

}
