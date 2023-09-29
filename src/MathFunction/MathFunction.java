package MathFunction;
public class MathFunction {

	public static void main(String[] args) {
		System.out.println(Math.max(10, 30));	// maximum value
		System.out.println(Math.min(10, 30));	// minimum value
		System.out.println(Math.sqrt(49));		// square root
		System.out.println(Math.abs(-100));		// always returns positive value
		System.out.println(Math.pow(2, 3));		// power of a number
		
//		random number
//		System.out.println((int)Math.random()*1001);
		int num = (int)Math.random();
		System.out.println("random int: "+num);
		
		int num2 = (int)(Math.random()*10);  // range 0 - 10
		System.out.println(num2);
	}

}
