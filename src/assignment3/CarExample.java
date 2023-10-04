// Question 4
package assignment3;

// Base Class
class Vehicle{
	private String color;
	private String fuelType;
	
	// Constructor
	public Vehicle(String color, String fuelType) {
		this.color = color;
		this.fuelType = fuelType;
	}
	
	// getter and setter method for color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// getter and setter method for fuelType
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}

// subclass Cars inherited Vehicle class
class Cars extends Vehicle{
	private String brand;
	
	// Constructor
	public Cars(String color, String fuelType, String brand) {
		super(color, fuelType);
		this.brand = brand;
	}
	
	// getter and setter method for brand
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// method to display car information
	public void displayInfo() {
		System.out.println("Color: "+getColor());
		System.out.println("Fuel: "+getFuelType());
		System.out.println("brand: "+getBrand());
	}
	
}

public class CarExample {

	public static void main(String[] args) {
		// object for Cars class and
		// setting values through constructor
		Cars car = new Cars("Red","Petrol","TATA");
		
		// Displaying current information
		System.out.println("-- Current car data --");
		car.displayInfo();
		
		// modifying previous set values
		car.setColor("Blue");
		car.setFuelType("Petrol");
		car.setBrand("Skoda");
		
		// Displaying updated information
		System.out.println("\n-- Updated car data --");
		car.displayInfo();
		
		
		
	}

}

//		OUTPUT
	
//		-- Current car data --
//		Color: Red
//		Fuel: Petrol
//		brand: TATA
//		
//		-- Updated car data --
//		Color: Blue
//		Fuel: Petrol
//		brand: Skoda