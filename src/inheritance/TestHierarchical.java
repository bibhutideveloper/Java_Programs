package inheritance;

public class TestHierarchical {

	public static void main(String[] args) {
		Sub11 s1 = new Sub11();
		Sub22 s2 = new Sub22();
		
		System.out.println("First class");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
		
		System.out.println("\nSecond class");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.city);
	}

}
