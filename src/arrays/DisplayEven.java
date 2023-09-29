package arrays;

public class DisplayEven {

	public static void main(String[] args) {
		int arr[] = {12, 23, 67, 90, 45};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
