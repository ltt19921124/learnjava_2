package bi1103;



class Ticket1 implements Runnable{
	private int num = 100;
	Object obj = new Object();
	boolean flag = true;
	
	public void run() {
		
		if (flag)
			while (true) {
				synchronized(obj) {
					show();
				}
			}
		else
			while (true)
				this.show();
	}
	public synchronized void show() {
		
		
		synchronized(obj) {
			if (num > 0) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "...fun..." +num--);
			}
		}
	}
}

public class SynFunctionLockDemo {

	public static void main(String[] args) {
		

		Ticket1 t = new Ticket1();
		
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();

	}

}
