package bi1112;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource4 {
	private String name;
	private int count = 0;
	private boolean flag = false;
	
	Lock lock = new ReentrantLock();
	
//	Condition con = lock.newCondition();
	Condition pro_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();
	
	public void set(String name) {
		lock.lock();
		try {
			while (flag)
				try {
					pro_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
			flag = true;
//			notifyAll();
			consumer_con.signal();
		} finally {
			lock.unlock();
		}
		
		
	}
	public void out() {
		lock.lock();
		try {
			while (!flag)
				try {
					consumer_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName() + "...消费者..." + this.name);
			flag = false;
//			notifyAll();
			pro_con.signal();
		} finally {
			lock.unlock();
		}
		
	}
}

class Producer implements Runnable {
	private Resource4 r;
	Producer(Resource4 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set("烤鸭");
		}
		
	}
}

class Consumer implements Runnable {
	private Resource4 r;
	Consumer(Resource4 r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			r.out();
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Resource4 r = new Resource4();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(pro);
		Thread t3 = new Thread(pro);
		Thread t4 = new Thread(con);
		Thread t5 = new Thread(con);
		Thread t6 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}






