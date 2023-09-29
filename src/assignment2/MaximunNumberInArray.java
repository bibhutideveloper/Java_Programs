// Question 2
package assignment2;

public class MaximunNumberInArray {	// Base class
	
	// Function to check for maximum number
	public static int check(int arr[]) {
		int max = arr[0];
		
		// Main Logic
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;   // returning maximum value from function
	}
	
	public static void main(String[] args) {
		int arr[] = {23, 43, 11, 65, 9, 44, 78};  // Demo elements in array
		
		// Function calling with argument: check(arr)
		// and printing result in a single statement
		System.out.println("Maximun = "+check(arr));
	}

}
