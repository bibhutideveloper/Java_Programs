package VariableTypes;

public class VariableTypes2 {
	int insv = 67;
	
	int fun1() {
		int insv = 100;
		return insv;
	}
	int fun2() {
		return insv;
	}

	public static void main(String[] args) {
		VariableTypes2 vt2 = new VariableTypes2();
		System.out.println(vt2.fun1());
		System.out.println(vt2.fun2());
		System.out.println(vt2.insv);
	}

}
