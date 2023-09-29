package methodOverloading;

public class Addition {
	void add(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}
	void add(int a, double b) {
		System.out.println("Addition: "+(a+b));
	}
	void add(double a, double b) {
		System.out.println("Addition: "+(a+b));
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		a.add(15, 25.0);
		a.add(10.0, 20.0);
	}

}
