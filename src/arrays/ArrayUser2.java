package arrays;

public class ArrayUser2 {
	public void getArray(int arr[]) {
		for(int x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		
		ArrayUser2 au2 = new ArrayUser2();
		au2.getArray(arr);
	}

}
