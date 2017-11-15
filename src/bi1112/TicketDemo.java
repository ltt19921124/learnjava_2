package bi1112;

class Ticket implements Runnable{
	private  int num = 100;

	static Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(Ticket.class) {
				if(num>0)
				{
					try{Thread.sleep(10);}catch (InterruptedException e){}
					
					System.out.println(Thread.currentThread().getName()+".....sale...."+num--);
				}
			}
		}
	}
}

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();//创建一个线程任务对象。

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
