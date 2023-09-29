package arrays;

public class AnnonymusArray {
	public void showArray(int arr[]) {
		for(int x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		AnnonymusArray aa = new AnnonymusArray();
		aa.showArray(new int[] {10, 20, 30, 40, 50});
	}

}
