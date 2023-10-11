package inheritance;

class Data{
	int marks = 60;
}

class Check extends Data{
	void done() {
		if(marks>=50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		System.out.println("DONE");
	}
}

public class CheckPassFail {

	public static void main(String[] args) {
		Check ck = new Check();
		ck.done();
	}

}
