import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(6);

        System.out.println("before removing: " + priorityQueue);

        // Retrieve and remove the first element from the priority queue
        Integer firstElement = priorityQueue.poll();

        if (firstElement != null) {
            System.out.println("Removed first element: " + firstElement);
        } else {
            System.out.println("Priority queue is empty.");
        }

        System.out.println("after removing: " + priorityQueue);
    }
}
