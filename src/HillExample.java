// Base Class
class HillStation{
	// Parent class methods that will be override by subclasses
	void location() {
		System.out.println("Hill Station");
	}
	void famousfor() {
		System.out.println("Hill view\n");
	}
}

// Manali class with details
class Manali extends HillStation{
	// overriding methods of parent class [HillStation]
	void location() {
		System.out.println("manali");
	}
	void famousfor() {
		System.out.println("Ice view\n");
	}
}
// Mussoorie class with details
class Mussoorie extends HillStation{
	// overriding methods of parent class [HillStation]
	void location() {
		System.out.println("Mussoorie");
	}
	void famousfor() {
		System.out.println("Watefall\n");
	}
}
// Gulmarg class with details
class Gulmarg extends HillStation{
	// overriding methods of parent class [HillStation]
	void location() {
		System.out.println("Gulmarg");
	}
	void famousfor() {
		System.out.println("Funny view\n");
	}
}

public class HillExample {

	public static void main(String[] args) {
		// Creating objects for each class
		Manali manali = new Manali();
		Mussoorie mussoorie = new Mussoorie();
		Gulmarg gulmarg = new Gulmarg();
		
		// calling methods for each and every class with respective object
		manali.location();
		manali.famousfor();
		
		mussoorie.location();
		mussoorie.famousfor();
		
		gulmarg.location();
		gulmarg.famousfor();
		
		
		
	}

}
