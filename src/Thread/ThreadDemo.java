package Thread;

class Demo extends Thread{
	private String name;
	
	Demo(String name) {
		super(name);
//		this.name = name;
	}
	
	public void run() {
		for(int x = 0;x < 15;x++) {
			System.out.println(name + "....x=" + x + "...name="+ Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		/*
		 * 主线程结束了虚拟机不一定结束
		 * 
		 */
		Demo d1 = new Demo("xiaoqaing");
		Demo d2 = new Demo("刘明");
//		Demo d3 = new Demo("wang");
		d1.start();//开启线程，调用run方法
		d2.start();
		System.out.println("over..." + Thread.currentThread().getName());
//		d3.start();
		
	}

}
