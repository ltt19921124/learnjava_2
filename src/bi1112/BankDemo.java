package bi1112;

class Bank {
	private int sum;
	private Object obj = new Object();
	public synchronized void add(int num) {
//		synchronized (obj) {
			sum += num;
			try{Thread.sleep(10);}catch (InterruptedException e){}
			System.out.println(Thread.currentThread().getName() + "sum=" + sum);
//		}
	}
}

class Cus implements Runnable {
	Bank b = new Bank();
	public void run() {
		for (int x = 0;x < 3;x++) {
			b.add(100);
		}
	}
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
	}

}
