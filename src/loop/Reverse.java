package loop;

public class Reverse {

	public static void main(String[] args) {
		int num = 1234;
		int tmp = num;
		int rev = 0;
		while(num>0) {
			int r = num%10;
			rev = rev*10+r;
			num = num/10;
		}
		System.out.println("Original no. = "+tmp);
		System.out.println("Reversed no. = "+rev);
	}

}
