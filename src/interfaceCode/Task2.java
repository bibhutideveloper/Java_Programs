package interfaceCode;

interface Flyable{
	void fly_obj();
}

class Spacecraft implements Flyable{
	public void fly_obj() {
		System.out.println("Spacecraft.");
	}
}

class Airplane implements Flyable{
	public void fly_obj() {
		System.out.println("Airplane.");
	}
}

class Helicopter  implements Flyable{
	public void fly_obj() {
		System.out.println("Helicopter.");
	}
}

public class Task2 {

	public static void main(String[] args) {
		Spacecraft sc = new Spacecraft();
		Airplane ap = new Airplane();
		Helicopter hc =new Helicopter();
		
		sc.fly_obj();
		ap.fly_obj();
		hc.fly_obj();
	}

}
