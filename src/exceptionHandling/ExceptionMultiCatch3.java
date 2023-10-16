package exceptionHandling;

public class ExceptionMultiCatch3 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) { // Specific
			System.out.println("Arithmetic exception occured.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // specific
			System.out.println("Araay index exception.");
		}
		catch(Exception e) { // General
			System.out.println("Parent exception.");
		}
//		catch(NullPointerException e) {
//			System.out.println("Null pointer.");
//		}
		
		/* 
		 * All catch blocks must be ordered from
		 * most specific to general
		 * otherwise it creates error
		 * catch(NullPointerException e){
		 * 	  System.out.println("Null Pointer.");
		 * }
		 * */
		
		System.out.println("Remaining code.");
	}

}
