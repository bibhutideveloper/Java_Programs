package arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int arr[] = {78, 89, 34, 12, 56, 98, 55};
		int max = 0;
		int min = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[i+1]) {
				max=arr[i];
				min=arr[i+1];
			}
		}
		System.out.println(max+" -- "+min);
	}

}
