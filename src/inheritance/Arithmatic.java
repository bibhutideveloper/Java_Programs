package inheritance;

public class Arithmatic {
	int n1 = 20;
	int n2 = 10;
}
class Multiplication extends Arithmatic{
	int calculate() {
		return n1*n2;
	}
}
class Addition extends Arithmatic{
	int calculate() {
		return n1+n2;
	}
}
class Subtraction extends Arithmatic{
	int calculate() {
		return n1-n2;
	}
}
class Remainder extends Arithmatic{
	int calculate() {
		return n1%n2;
	}
}