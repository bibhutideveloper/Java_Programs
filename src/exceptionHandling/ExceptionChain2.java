package exceptionHandling;
// Checked Exception Example
public class ExceptionChain2 {
	void method1() {
		try {
			throw new java.io.IOException("Device error.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
			method2();
		}catch(Exception e){
			System.out.println("Exception handled.");
		}
	}
	public static void main(String[] args) {
		ExceptionChain2 ec2 = new ExceptionChain2();
//		ec.method1();
//		ec.method2();
		ec2.method3();
	}

}
