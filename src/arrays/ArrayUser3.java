package arrays;

public class ArrayUser3 {
	public int[] getArray() {
//		int arr[] = {10, 20, 30, 40, 50};
		
		return new int[] {10, 20, 30, 40, 50};
		
//		return arr;
	}
	
	public static void main(String[] args) {
		ArrayUser3 au3 = new ArrayUser3();
		int arr[] = au3.getArray();
		
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
