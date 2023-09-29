package loop;

public class Armstrong {

	public static void main(String[] args) {
		int num = -153;
		int tmp = num;
		int sum = 0;
		while(num>0) {
			int r = num%10;
			r = r*r*r;
			num = num/10;
			sum = sum+r;
		}
		if(sum==tmp) {
			System.out.println("Armstrong.");
		}else {
			System.out.println("Not Armstrong.");
		}
	}

}
