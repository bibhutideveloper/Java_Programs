package exceptionHandling;

public class ExceptionExample4 {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		
		try {
			a[10]=50;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
		for(int i:a) {
			System.out.println(i);
		}
	}

}
