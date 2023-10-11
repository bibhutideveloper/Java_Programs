// Question 5
package assignment3;

public class Question5 {
	double radius;
	String color;
	
	// Default constructor
	Question5(){
		radius = 1;
		color = "red";
	}
	
	// Parameterized constructor
	Question5(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	public void displayInfo() {
		System.out.println("Color: "+color+"\nRadius: "+radius);
	}
	
	public static void main(String[] args) {
		Question5 defaultCircle = new Question5();		
		Question5 paramCircle = new Question5(22,"blue");
		
		defaultCircle.displayInfo();		
		paramCircle.displayInfo();
		
	}

}
