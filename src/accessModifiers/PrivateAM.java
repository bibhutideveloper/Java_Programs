package accessModifiers;
class A{
	int a = 111;
	private int a2 = 222;
	private void show() {
		System.out.println("Value of a= "+a);
	}
}

public class PrivateAM {
	int b = 10;	// instance variable
	public static void main(String[] args) {
		PrivateAM pam = new PrivateAM();
		System.out.println(pam.b);
		
		A obj = new A();
//		System.out.println(obj.a); // private variable, not accessible
		
//		obj.show(); // private method, not accessible
	}

}
