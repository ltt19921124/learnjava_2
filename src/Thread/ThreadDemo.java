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
		 * ���߳̽������������һ������
		 * 
		 */
		Demo d1 = new Demo("xiaoqaing");
		Demo d2 = new Demo("����");
//		Demo d3 = new Demo("wang");
		d1.start();//�����̣߳�����run����
		d2.start();
		System.out.println("over..." + Thread.currentThread().getName());
//		d3.start();
		
	}

}
