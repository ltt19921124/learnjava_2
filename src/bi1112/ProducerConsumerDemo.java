package bi1112;

class Resource4 {
	private String name;
	private int count;
	private boolean flag;
	public synchronized void set(String name) {
		if (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
		flag = true;
		notify();
	}
	public synchronized void out() {
		if (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
		flag = false;
		notify();
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		
	}

}
