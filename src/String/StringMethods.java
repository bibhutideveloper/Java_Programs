package String;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Bibhuti";
		System.out.println("name: "+name);
		System.out.println("Length: "+name.length());
		System.out.println("Uppercase: "+name.toUpperCase());
		System.out.println("Lowercase: "+name.toLowerCase());
		System.out.println(name.indexOf('u'));
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('i',5)); // checks from index 5
		
		System.out.println("------------");
		
		String s1 = "hello";
		String s2 = "Hello";
		System.out.println(s1.compareTo(s2));
		
		// concat() --> append one string to end of another string.
		String str1 = "hello";
		String str2 = "world";
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" "+str2));
		
		System.out.println(str1+" "+str2);
		
		System.out.println("------------");
		
		String str3 = "hello";		
		String str4 = "Hello";
		System.out.println(str3.equals(str4));
		
		// compareTo and equals both works same,
		// but compareTo returns zero if both are same 
		// and return difference between the characters if not same
		// equals returns boolean true or false
		
		System.out.println("------------");

		String str5 = "hello";
		System.out.println(str5.startsWith("h"));
		System.out.println(str5.endsWith("o"));
		
		System.out.println("------------");
		
		// replace()
		String str6 = "jack";
		System.out.println(str6.replace('j','b'));
		
		System.out.println("------------");
		
		// trim()
		String str7 = "    hello   ";
		System.out.println("Before trim: "+str7);
		System.out.println("After trim: "+str7.trim());
		
		String str8 = "   Hello World    ";
		System.out.println("\nBefore trim: "+str8);
		System.out.println("After trim: "+str8.trim());
		// it trims only starting and ending space.
	}

}
