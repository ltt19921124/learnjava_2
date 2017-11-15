package bi1112;

class Ticket1 implements Runnable{
	private static int num = 100;
	Object obj = new Object();
	boolean flag = true;
	public void run() {
//		System.out.println("this:" + this);
		if (flag) {
			while(true) {
				synchronized(obj) {
					show();
				}
			}
		}
		else {
			while(true) {
				show();
			
			}
		}
	}
	
	public synchronized void show() {
		synchronized (obj) {
		
			if(num>0) {
				try{Thread.sleep(10);}catch (InterruptedException e){}
				System.out.println(Thread.currentThread().getName()+".....fun...."+num--);
			}
		}
	}
	
}

public class SynFuntionLockDemo {

	public static void main(String[] args) {
		Ticket1 t = new Ticket1();//创建一个线程任务对象。
		System.out.println("t:" + t);
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);


		t1.start();
		try{Thread.sleep(10);}catch (InterruptedException e){}
		t.flag = false;
		t2.start();
		
		
	}

}
