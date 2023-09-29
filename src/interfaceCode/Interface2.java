package interfaceCode;

interface Bank{
	float rateOfInterest();
}

class SBI implements Bank{
	public float rateOfInterest() {
		return 8.9F;
	}
}
class AXIS implements Bank{
	public float rateOfInterest() {
		return 8.6F;
	}
}
class ICICI implements Bank{
	public float rateOfInterest() {
		return 5.8F;
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Bank bSBI = new SBI();
		System.out.println("SBI: "+bSBI.rateOfInterest());
		
		Bank bAXIS = new AXIS();
		System.out.println("AXIS: "+bAXIS.rateOfInterest());
		
		Bank bICICI = new ICICI();
		System.out.println("ICICI: "+bICICI.rateOfInterest());
	}

}
