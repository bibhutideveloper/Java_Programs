package inheritance;
import java.util.Scanner;

class Num1{
	Scanner sc = new Scanner(System.in);
	int a;
	void show1() {
		System.out.println("Enter 1st number: ");
		a = sc.nextInt();
	}
}
class Num2 extends Num1{
	int b;
	void show2() {			
		System.out.println("Enter 2nd number: ");
		b = sc.nextInt();
	}
}
class Add extends Num2{
	void display() {
		System.out.println("Value of a= "+a);
		System.out.println("Value of b= "+b);
		System.out.println("Sum = "+(a+b));
	}
}

public class SumNumbers {
	public static void main(String args[]) {
		Add obj = new Add();
		obj.show1();
		obj.show2();
		obj.display();
	}
}
