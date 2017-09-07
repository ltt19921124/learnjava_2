package Thread1;

import java.util.Hashtable;

class NyThraed3 implements Runnable {
	private int ticket = 10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			if (this.ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "ÂôÆ±,Ticket = " + this.ticket);
			}
		}
	}
	
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hs = new Hashtable();
	}

}
