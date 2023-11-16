package threadJava;

class ThreadExample extends Thread{
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
		
		t1.start();
		t1.setPriority(MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t2.start();
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		
		t3.start();
		t3.setPriority(NORM_PRIORITY);
		System.out.println(t3.getPriority());
	}

	public void run() {
		System.out.println("Inside thread.");
	}
}
