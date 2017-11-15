package bi1112;

class Demo implements Runnable{
	public void run() {
		for (int x = 0;x < 20;x++) {
			System.out.println(Thread.currentThread().getName() + "...." +  x);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	}

}
