package Thread;

class Ticket_2 implements Runnable{
	private static int num = 100;
	Object obj = new Object();
	
	boolean flag = true;
	
	public void run() {
//		Object obj = new Object();
		
//		System.out.println("this:" + this);
		if (flag)
			while (true) {
				synchronized (obj) {
					show();
				}
			}
		else 
			while (true)
				show();
	}
	public synchronized void show() {
		synchronized (obj){
			if (num > 0){
				try{
					Thread.sleep(10);
				} catch(InterruptedException e) {
					
				}
				System.out.println(Thread.currentThread().getName() + "...function..." + num--);
			}
		}
	}
	
}


public class DeadLockDemo {

	public static void main(String[] args) {
		
		Ticket_2 t = new Ticket_2();//
//		System.out.println("t:" + t);
//		Class clazz = t.getClass();
//		Class clazz_1 = Ticket.class;
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		
		t1.start();
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {
			
		}
		t.flag = false;
		t2.start();
		
	}

}
