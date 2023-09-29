package encapsulation;

public class TestPeople {

	public static void main(String[] args) {
		Student s = new Student();
		Employee e = new Employee();
		PersonalDetails pd = new PersonalDetails();
		
		s.getCollegeName("IMED Pune");
		s.getDegree("MCA");
		s.getPassoutYear(2023);
		
		e.getEmpNo(1221);
		e.getSalary(10000.00);
		e.getJobPost("Developer");
		
		pd.getName("Bibhuti");
		pd.getCity("Pune");
		pd.getState("Maharashtra");
		pd.getCountry("India");
		
		System.out.println(s.setPassoutYear());
	}

}
