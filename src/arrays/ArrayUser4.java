package arrays;

public class ArrayUser4 {
	public int[] getArray(int arr[]) {
		return arr;
	}
	
	public static void main(String[] args) {
		ArrayUser4 au4 = new ArrayUser4();
		int arr[] = {10, 20, 30, 40, 50};
		int x[] = au4.getArray(arr);

		for(int y : x) {
			System.out.println(y);
		}
	}

}
