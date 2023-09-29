package interfaceCode;

interface Abc{
	public void show();
}

class Xyz implements Abc{
	public void show() {
		System.out.println("Interface used.");
	}
}

public class Interface {

	public static void main(String[] args) {
		Xyz obj = new Xyz();
		obj.show();
	}

}
