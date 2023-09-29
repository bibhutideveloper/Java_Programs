package encapsulation;

public class TestReadOnly {

	public static void main(String[] args) {
		ReadOnly ro = new ReadOnly();
		ro.getId(900);
		ro.getName("Bibhuti");
		
		System.out.println("Age: "+ro.setAge());
	}

}
