package stackJava;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<Integer>();
		
		// add element
		numbers.push(23); // bottom element
		numbers.push(98);
		numbers.push(34);
		numbers.push(65);
		numbers.push(54); // top element
		
		System.out.println(numbers);
		
		// get 1st element from top
		System.out.println(numbers.peek());
		
		// remove 1st element from top
		numbers.pop();
		System.out.println(numbers);
	}

}
