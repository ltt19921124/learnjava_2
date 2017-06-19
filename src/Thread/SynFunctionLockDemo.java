package Thread;

class Ticket_1 implements Runnable{
	private static int num = 100;
	Object obj = new Object();
	
	boolean flag = true;
	
	public void run() {
//		Object obj = new Object();
		
//		System.out.println("this:" + this);
		if (flag)
			while (true) {
				synchronized (this){
					if (num > 0){
						try{
							Thread.sleep(10);
						} catch(InterruptedException e) {
							
						}
						System.out.println(Thread.currentThread().getName() + "...obj..." + num--);
					}
				}
			}
		else 
			while (true)
				show();
	}
	public static synchronized void show() {
		if (num > 0){
			try{
				Thread.sleep(10);
			} catch(InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + "...function..." + num--);
		}
	}
	
}


class SynFunctionLockDemo {

	public static void main(String[] args) {
		
		Ticket_1 t = new Ticket_1();//
//		System.out.println("t:" + t);
		
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






