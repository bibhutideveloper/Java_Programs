// Create an interface called "Person" with a method called "speak". 
// Create two classes  called "Student" and "Teacher" that implement  
// the Person interface and implement the "speak" method. Create objects 
// of both the Student and  Teacher classes and call their 
// respective "speak"  methods.

package interfaceCode;

interface Person{
	void speak();
}

class Student implements Person{
	public void speak() {
		System.out.println("Person is speaking.");
	}
}
class Teacher implements Person{
	public void speak() {
		System.out.println("Teacher is speaking.");
	}
}

public class PersonExample {

	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		
		s.speak();
		t.speak();
	}

}
