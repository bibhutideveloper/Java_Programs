package arrays;

public class FindElement2 {
	public int check(int arr[], int find) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==find) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {12, 34, 43, 67, 56};
		int find = 34;
		
		FindElement2 fe2 = new FindElement2();
		int x = fe2.check(arr, find);
		
		if(x==1) {
			System.out.println("found.");
		}else {
			System.out.println("not found.");
		}
	}

}
