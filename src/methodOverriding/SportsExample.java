package methodOverriding;

class Sports{
	void play() {
		System.out.println("Sports");
	};
}

class Football extends Sports{
	void play() {
		System.out.println("Playing Football");
	}
}
class Basketball extends Sports{
	void play() {
		System.out.println("Playing Basketball");
	}
}
class Rugby extends Sports{
	void play() {
		System.out.println("Playing Rugby");
	}
}

public class SportsExample {

	public static void main(String[] args) {
		Football fb = new Football();
		Basketball bb = new Basketball();
		Rugby rb = new Rugby();
		
		fb.play();
		bb.play();
		rb.play();
		
	}

}
