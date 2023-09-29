package enumCode;

enum Months{
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class enumExample2 {
	public static void main(String[] args) {
		for(Months m : Months.values()) {
			System.out.println(m);
		}
	}
}
