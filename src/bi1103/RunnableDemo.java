package bi1103;

class MyThread implements Runnable {

	
	public void run() {
		for (int i = 0;i < 10;i++) {
			System.out.println(Thread.currentThread().getName() + "...i=" + i);
		}
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		t2.start();
		
	}

}
