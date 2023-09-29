package inheritance;

public class Member {
//	String name;
//	int age;
//	long phone;
//	String address;
//	double salary;
	
	void printSalary(double salary) {
		System.out.println("Salary: "+salary);;
	}
}

class Employee extends Member{
	String specilization="Developer";
	String department="IT";
	
	void display(String name, int age, long phone, String address, String spcl, String dept) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone: "+phone);
		System.out.println("Address: "+address);
		System.out.println("Specilization: "+spcl);
		System.out.println("Department: "+dept);
	}
}
class Manager extends Member{
	String specilization;
	String department;
	
	void display(String name, int age, long phone, String address, String spcl, String dept) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone: "+phone);
		System.out.println("Address: "+address);
		System.out.println("Specilization: "+spcl);
		System.out.println("Department: "+dept);
	}
}

/*
	Create a class named 'Member' having the following members:
	Data members
	1 - Name
	2 - Age
	3 - Phone number
	4 - Address
	5 - Salary
	It also has a method named 'printSalary' which prints the salary of 
	the members.
	Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
	The 'Employee' and 'Manager' classes have data members 'specialization' 
	and 'department' respectively. 
	Now, assign name, age, phone number, address and salary to an employee 
	and a manager by making an object of both of classes and print the same.
 */
