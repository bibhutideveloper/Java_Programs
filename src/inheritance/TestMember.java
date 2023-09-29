package inheritance;

public class TestMember {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("- Employee Details -");
		emp.display("Bibhuti",23,9876543210L,"Pune","Developer","IT");
		emp.printSalary(10000);
		
		System.out.println();
		
		Manager mgr = new Manager();
		System.out.println("- Manager Details -");
		mgr.display("Alexa",20,9876333980L,"Maharashtra","Manager","Accounts");
		mgr.printSalary(30000);
	}

}
