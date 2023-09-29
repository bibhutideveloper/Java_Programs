package encapsulation;

public class PersonalDetails {
	private String name;
	private String city;
	private String state;
	private String country;
	
	void getName(String name) {
		this.name = name;
	}
	void getCity(String city) {
		this.city = city;
	}
	void getState(String state) {
		this.name = state;
	}
	void getCountry(String country) {
		this.country = country;
	}
}
