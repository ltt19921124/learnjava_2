package Thread;

class Demo_1 extends Thread{
	private String name;
	
	Demo_1(String name) {
		super(name);
//		this.name = name;
	}
	
	public void run() {
		for(int x = 0;x < 10;x++) {
			System.out.println("....x=" + x + "...name="+ Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		/*
		 * 主线程结束了虚拟机不一定结束
		 * 
		 */
		Demo_1 d1 = new Demo_1("xiaoqaing");
		Demo_1 d2 = new Demo_1("刘明");
//		Demo d3 = new Demo("wang");
		d1.start();//开启线程，调用run方法
		d2.start();
		for(int x = 0;x < 20;x++) {
			System.out.println("over..." + Thread.currentThread().getName());
		}
//		d3.start();
//		System.out.println(4 / 0);
	}

}
