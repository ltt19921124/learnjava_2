package bi1103;

class Test implements Runnable{
	private boolean flag;
	
	Test(boolean flag) {
		this.flag = flag;
	}
	public void run() {
		if (flag) {
			synchronized(MyLock.locka) {
				System.out.println("if   locka...");
				synchronized(MyLock.lockb) {
					System.out.println("if   lockb...");
				}
			}
		}
		else {
			synchronized(MyLock.lockb) {
				System.out.println("else   lockb...");
				synchronized(MyLock.locka) {
					System.out.println("else   locka...");
				}
			}
		}
	}
}

class MyLock {
	
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
	
}

public class DeadLockTest {

	public static void main(String[] args) {
		Test a = new Test(true);
		Test b = new Test(false);
		Test c = new Test(true);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
		
	}

}






