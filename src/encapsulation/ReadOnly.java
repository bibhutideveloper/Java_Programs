package encapsulation;

public class ReadOnly {
	private int id;
	private String name;
	private int age = 10;
	
	void getId(int id) {
		this.id = id;
	}
	void getName(String name) {
		this.name = name;
	}
	int setAge() {
		return age;
	}
	
}
