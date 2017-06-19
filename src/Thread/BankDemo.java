package Thread;

class Bank {
	private int sum;
	
//	private Object obj = new Object();
	
	public synchronized void add(int num) { //同步函数
//		synchronized(obj) {//使用同一个锁
			sum = sum + num;
			try {
				Thread.sleep(10);
			} catch (InterruptedException r){
				
			}
			
			System.out.println("sum=" + sum);
//		}
	}
	
}

class Cus implements Runnable {
	private Bank b = new Bank();
	public void run() {
		
		for(int x = 0;x < 3;x++) {
			b.add(100);
		}
	}
}

class BankDemo {

	public static void main(String[] args) {
		
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
	}

}




