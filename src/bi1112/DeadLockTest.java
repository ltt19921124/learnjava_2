package bi1112;

class Test1 implements Runnable{
	private boolean flag;
	
	Test1(boolean flag) {
		this.flag = flag;
	}
	public void run() {
		if (flag) {
			synchronized(Mylock.locka) {
				System.out.println("...if locka...");
				synchronized(Mylock.lockb) {
					System.out.println("...if lockb...");
				}
			}
		} else {
			synchronized(Mylock.lockb) {
				System.out.println("...else lockb...");
				synchronized(Mylock.locka) {
					System.out.println("...else locka...");
				}
			}
		}
	}
}

class Mylock {
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}

public class DeadLockTest {

	public static void main(String[] args) {
		Test1 a = new Test1(true);
		Test1 b = new Test1(false);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
	}

}





