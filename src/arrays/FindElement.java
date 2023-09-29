package arrays;

public class FindElement {

	public static void main(String[] args) {
		int arr[] = {13, 45, 67, 78, 76, 34, 56};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==78) {
				System.out.println(arr[i]+" is present.");
			}
		}
	}

}
