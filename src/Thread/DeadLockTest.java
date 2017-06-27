package Thread;

class Test_1 implements Runnable{
	
	private boolean flag;
	Test_1(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if (flag) {
			synchronized (MyLock.locka) {
				System.out.println("if   locka...");
				synchronized (MyLock.lockb) {
					System.out.println("if  lockb...");
				}
			}
		} else {
				synchronized (MyLock.locka) { 
					
					System.out.println("else   lockb...");
					synchronized (MyLock.lockb) {
						System.out.println("else  locka...");
					}
			    }
	
		  }
	}
}

class MyLock {
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}

class DeadLockTest {

	public static void main(String[] args) {
		Test_1 a = new Test_1(true);
		Test_1 b = new Test_1(false);
		
		Thread t3 = new Thread(a);
		Thread t4 = new Thread(b);
		t3.start();
		t4.start();
		
	}

}




