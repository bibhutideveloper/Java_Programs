package inheritance;
import myPackage.PrivateAccessInherit;

class Subc1 extends PrivateAccessInherit{
	void result() {
		System.out.println("Result: "+(a*b));
	}
}

public class TestPrivateAccessInherit {
	public static void main(String[] args) {
		Subc1 s = new Subc1();
		s.result();
	}

}
