package String;

public class SameString {

	public static void main(String[] args) {
		String str1 = "bibhuti";
		String str2 = "Bibhuti";
		
		// check with case
		if(str1.compareTo(str2) == 0) {
			System.out.println("Strings are same.");
		}else {
			System.out.println("Strings are different.");
		}
		
		// check with ignore case
		if(str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("Strings are same.");
		}else {
			System.out.println("Strings are different.");
		}
	}

}
