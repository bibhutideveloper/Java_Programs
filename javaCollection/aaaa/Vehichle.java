// Question 4 :
// Create a class Car that inherits from base class Vehicle 
// using private strings and getter/setter methods to achieve encapsulation

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

public class Vehichle {

	public static void main(String[] args) {
		// object for Cars class and
		// setting values through constructor
		Cars car = new Cars("Green","Petrol","Skoda");
		
		// Displaying current information
		System.out.println("car info");
		car.displayInfo();
		
		// modifying previous set values
		car.setColor("Blue");
		car.setFuelType("Petrol");
		car.setBrand("Mahindra");
		
		// Displaying updated information
		System.out.println("\nUpdated car info");
		car.displayInfo();
		
		
		
	}

}
