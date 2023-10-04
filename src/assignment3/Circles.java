// Question 5
package assignment3;

// Base class
public class Circles {
	double radius;
	String color;
	
	// Default constructor
	Circles(){
		radius = 1;
		color = "red";
	}
	
	// Parameterized constructor
	Circles(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	// Method to display circle information
	public void displayInfo() {
		System.out.println("\n-- Circle Information --");
		System.out.println("Color: "+color+"\nRadius: "+radius);
	}
	
	public static void main(String[] args) {
		// Object creation for Circles class
		
		// Object to call default constructor
		Circles defaultCircle = new Circles();		

		// Object to call Parameterized constructor
		Circles paramCircle = new Circles(22,"blue");
		
		// Calling method with default constructor value
		defaultCircle.displayInfo();
		
		// Calling method with Parameterized constructor value
		paramCircle.displayInfo();
		
	}

}

//		OUTPUT
		
//		-- Circle Information --
//		Color: red
//		Radius: 1.0
//		
//		-- Circle Information --
//		Color: blue
//		Radius: 22.0