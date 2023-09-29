package Method;

public class Method1 {
	public static void showMessage() {
		System.out.println("Static method.");
	}
	
	public void getMessage() {
		System.out.println("Accessed by object.");
	}

	public static void main(String[] args) {
		// direct method calling
		showMessage();
		
		// calling method by creating object
		Method1 obj = new Method1();
		obj.getMessage();
	}

}
