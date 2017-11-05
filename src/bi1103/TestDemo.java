package bi1103;

class Demo extends Thread {
	private String name;
	
	Demo(String name) {
		super(name);
		
//		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(name + "...i=" + i+ "...name=" + Thread.currentThread().getName());
		}
	}
}

public class TestDemo {

	public static void main(String[] args) {

		Demo d1 = new Demo("Сǿ");
		Demo d2 = new Demo("xiaoming");
		
		d1.start();
		d2.start();
		
	}

}
