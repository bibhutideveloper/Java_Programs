package enumCode;

enum Months2{
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Task {

	public static void main(String[] args) {
		Months2 m2 = Months2.FEBRUARY;
		
		switch(m2){
			case FEBRUARY:
				System.out.println(2);
				break;
			case JANUARY:
				System.out.println(3);
				break;
			default:
				System.out.println("Invalid!");
				break;
		}
	}

}
