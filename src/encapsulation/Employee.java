package encapsulation;

public class Employee {
	private int empNo;
	private double salary;
	private String jobPost;
	
	void getEmpNo(int empNo) {
		this.empNo = empNo;
	}
	void getSalary(double salary) {
		this.salary = salary;
	}
	void getJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
}
