package exceptionHandling;

public class ExceptionExample3 {

	public static void main(String[] args) {
		String s = "abc";
		try {
			System.out.println(Integer.parseInt(s));
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println("Remaining code.");
	}

}
