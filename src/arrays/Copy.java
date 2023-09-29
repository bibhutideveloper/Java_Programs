package arrays;

public class Copy {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int cpy[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			cpy[i] = arr[i];

			System.out.println(cpy[i]);
		}
	}

}
