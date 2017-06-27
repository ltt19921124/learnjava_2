package Thread_1;

class Resource {
	String name;
	String sex;
	boolean flag = false;
}

class Input implements Runnable{
	
	Resource r;
	Object obj = new Object();
	Input(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		int x = 0;
			
				while (true) {
					synchronized (r) {
						if (x == 0) {
							r.name = "mike";
							r.sex = "nan";
						} else {
							r.name = "丽丽";
							r.sex = "女";
						}
					}
					x = (x + 1)%2;
				}
			
	}
}

class Output implements Runnable {
	Resource r;
	Object obj = new Object(); 
	Output(Resource r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		
			
			while (true) {
				synchronized (r) {
					System.out.println(r.name + "..." + r.sex);
				}
			}
		
	}
	
}

public abstract class ResourceDemo {
	public static void main(String[] args) {
		//创建资源
		Resource r = new Resource();
		//创建任务
		Input in = new Input(r);
		Output out = new Output(r);
		//创建线程，执行路径
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//开启线程
		t1.start();
		t2.start();
		
	}
}











