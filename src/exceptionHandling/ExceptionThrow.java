package exceptionHandling;

public class ExceptionThrow {

	public static void main(String[] args) {
		int age = 98;
		if(age<18) {
			try {
				throw new ArithmeticException("Not Eligible");
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}else {
			try {
				int a = 10/0;
			}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}
	}

}
