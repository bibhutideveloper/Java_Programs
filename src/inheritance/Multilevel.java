package inheritance;

class A {
	void show1() {
		System.out.println("class A accessed");
	}
}
class B extends A {
	void show2() {
		System.out.println("class B accessed");
	}
}
class C extends B {
	void show3() {
		System.out.println("class C accessed");
	}
}

public class Multilevel{
	public static void main(String args[]) {
		C obj = new C();
		obj.show1();
		obj.show2();
		obj.show3();
	}
}