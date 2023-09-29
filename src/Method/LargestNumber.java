package Method;

public class LargestNumber {
	public void check() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println((a>b) ? ((b>c)?a:(c>a)?c:a) : (b>c)?b:c);
	}

	public static void main(String[] args) {
		LargestNumber ln =  new LargestNumber();
		ln.check();
	}

}
