// Question 1
package assignment3;

// Base Class
public class Circle {
	double radius;
	String color;
	
	// Default constructor with default value
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	// Parameterized constructor
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// Method to calculate the area of the circle
	public double getArea() {
		// Formula to calculate Circle Area
		double area = Math.PI*radius*radius;
		
		// Printing Radius and Color of circle
		System.out.println("Radius: "+radius+"\nColor: "+color);
		
		// Returning calculated area from this method
		return area;
	}

	public static void main(String[] args) {
		// Create a circle with default value
		// This will call default constructor and getArea method
		Circle defaultCircleObj = new Circle();
		System.out.println("Area: "+defaultCircleObj.getArea());
		
		System.out.println();
		
		// Create a circle with user defined value
		// This will call parameterized constructor and getArea method
		Circle paramCircleObj = new Circle(2,"blue");
		System.out.println(paramCircleObj.getArea());
	}

}

// 		OUTPUT

//		Radius: 1.0
//		Color: red
//		Area: 3.141592653589793
//	
//		Radius: 2.0
//		Color: blue
//		12.566370614359172
