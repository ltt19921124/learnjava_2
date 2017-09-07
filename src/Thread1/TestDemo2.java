package Thread1;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "、i = " + i);
		}
	}
	
}

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyThread2 mt = new MyThread2();
//		Thread t1 = new Thread(mt,"线程A");
//		Thread t2 = new Thread(mt,"线程B");
//		Thread t3 = new Thread(mt,"线程C");
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t3.setPriority(Thread.MIN_PRIORITY);
//		t2.setPriority(Thread.MAX_PRIORITY);
//		t1.start();
//		t2.start();
//		t3.start();
		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.MIN_PRIORITY);
	}

}







