// Question 2
package assignment3;

// Base class
class Car{
	// Method of Car class
	void startEngine() {
		System.out.println("Car engine started.");
	}
}

// Using Car class method in MAHINDRA class using Inheritance
class Mahindra extends Car {
	// Method of MAHINDRA class
	void displayModel() {
		System.out.println("MAHINDRA XUV400");
	}
}

public class CarInheritance {

	public static void main(String[] args) {
		// Creating object for MAHINDRA class
		Mahindra mahindraCar = new Mahindra();
		
		// Calling car class method
		mahindraCar.startEngine();
		
		// calling MAHINDRA class method
		mahindraCar.displayModel();
	}

}

//		OUTPUT

//		Car engine started.
//		MAHINDRA XUV400
