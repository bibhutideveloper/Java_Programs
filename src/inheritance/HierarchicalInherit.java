package inheritance;

public class HierarchicalInherit {
	int id = 101;
	String name = "Bibhuti";
	String city = "Pune";
}
class Sub11 extends HierarchicalInherit{
	void show1() {
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("City="+city);
	}
}
class Sub22 extends HierarchicalInherit{
	void show1() {
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("City="+city);
	}
}