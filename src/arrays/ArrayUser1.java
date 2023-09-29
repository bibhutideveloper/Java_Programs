package arrays;

public class ArrayUser1 {
	public void getArray() {
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int x : arr) {
			System.out.println(x);
			sum += x;
		}
		System.out.println("\nSum of Array = "+sum);
	}
	
	public static void main(String[] args) {
		ArrayUser1 au1 = new ArrayUser1();
		au1.getArray();
	}

}
