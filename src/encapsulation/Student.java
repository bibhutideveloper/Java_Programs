package encapsulation;

public class Student {
	private String collegeName;
	private String degree;
	private int passoutYear;
	
	void getCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	void getDegree(String degree) {
		this.degree = degree;
	}
	void getPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}
	int setPassoutYear() {
		return passoutYear;
	}
}
