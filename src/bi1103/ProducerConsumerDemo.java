package bi1103;

class Resource2 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name) {
		while (flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name = name + count;
		
		count ++;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
		
		flag = true;
		notifyAll();
	}
	
	public synchronized void out() {
		while (!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName() + "...消费者........" + this.name);
		flag = false;
		notifyAll();
	}
}

class Producer implements Runnable {

	private Resource2 r;
	Producer(Resource2 r) {
		this.r = r;
	}
	public void run() {
		
		while(true) {
			r.set("烤鸭");
		}
	}
	
}

class Consumer implements Runnable {

	private Resource2 r;
	Consumer(Resource2 r) {
		this.r = r;
	}
	public void run() {
		
		while(true) {
			r.out();
		}
	}
	
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Resource2 r = new Resource2();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}



