package Thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "、i = " + i);
		}
	}
	
}


public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt = new MyThread();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
//		System.out.println("k");
//		MyThread mt2 = new MyThread();
//		MyThread mt3 = new MyThread();
		
//		new Thread(mt1).start();
//		new Thread(mt1).start();
//		new Thread(mt1).start();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("hello");
//			}
//		}).start();
		//Lambda表达式
		
//		new Thread(() -> System.out.println("hello")).start();
		
//		FutureTask<String> task = new FutureTask<String>(new MyThread());
//		new Thread(task).start();//启动多线程
//		System.out.println(task.get());
		
	}

}





