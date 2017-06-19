package Thread;

class Demo_2 implements Runnable {

	@Override
	public void run() {
		for(int x = 0;x < 10;x++) {
			System.out.println(Thread.currentThread().getName() + "..." + x);
		}
	}
	
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		
		
		Demo_2 d = new Demo_2();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
//		Thread t1 = new Thread();
		t1.start();
		t2.start();
	}

}
