package ControlFlow;

public class tempreature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 42;
		
		if(t<0) {
			System.out.println("Freezing weather.");
		}else if(t>=0 && t<=10) {
			System.out.println("Very cold weather.");
		}else if(t>10 && t<=20) {
			System.out.println("Cold weather.");
		}else if(t>20 && t<=30) {
			System.out.println("Normal in tempreature.");
		}else if(t>30 && t<=40) {
			System.out.println("Its hot.");
		}else{
			System.out.println("Its very hot.");
		}
	}

}
