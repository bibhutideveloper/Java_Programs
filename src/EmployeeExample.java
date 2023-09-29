class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		
		System.out.println("Name:"+name);
		System.out.println("Salary: "+salary);
	}
}
class Manager extends Employee {	
	String department;
	Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
		System.out.println("Department: "+department);
	}
}

public class EmployeeExample {

	public static void main(String[] args) {
//		System.out.println("Employee Details\n------");
//		Employee emp = new Employee("Akash",10000);
		
		System.out.println("\nManager Details\n------");
		Manager mgr = new Manager("Bibhuti",20000,"IT");
	}

}
