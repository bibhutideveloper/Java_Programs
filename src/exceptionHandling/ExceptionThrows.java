package exceptionHandling;

import java.io.IOException;

public class ExceptionThrows {
	void method1() throws IOException{
		throw new IOException("Device error");
	}
	void method2() throws IOException{
		method1();
	}
	void method3() {
		try {
			method2();
		}catch(Exception e){
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		ExceptionThrows ets = new ExceptionThrows();
//		ets.method1();
//		ets.method2();
		ets.method3();
	}

}
