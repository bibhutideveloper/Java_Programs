package inheritance;

public class TestVehicle {
	public void display() {
		Car c = new Car();
		System.out.println("Mileage= "+c.mileage);
		System.out.println("Brake= "+c.brake);
		System.out.println("Brand= "+c.companyName);
		System.out.println("Color= "+c.color);
	}

	public static void main(String[] args) {
		TestVehicle tv = new TestVehicle();
		tv.display();
	}

}
