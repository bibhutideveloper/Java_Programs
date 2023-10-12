package queueJava;
//import java.util.Queue;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
//		Queue<String> q1 = new PriorityQueue();
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		
		// add element
		q1.add(4);
		q1.add(6);
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(5);
		
		System.out.println(q1);
		System.out.println(q1.peek());
		
//		for(int i:q1) {
//			System.out.println(i);
//		}
		
	}

}
