package arrays;

public class DescendingSort {
	public int[] sort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int tmp = 0;
				if(arr[i]<arr[j]) {
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp; 
				}
			}
		}		
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {12, 45, 12, 10, 77, 23};
		DescendingSort ds = new DescendingSort();
		int[] x = ds.sort(arr);
		
		for(int y : x) {
			System.out.println(y);
		}
	}

}
