package bi1112;

class Resource {
	String name;
	String sex;
	boolean flag = false;
}

class Input implements Runnable {
	Resource r;
	Input(Resource r) {
		this.r = r;
	}
	public void run() {
		int x = 0;
		while (true) {
			synchronized (r) {
				if (r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			if (x == 0) {
				r.name = "mike";
				r.sex = "nan";
			} else {
				r.name = "丽丽";
				r.sex = "女女女女女女女女";
			}
			r.flag = true;
			r.notify();
			}
			x = (x + 1) % 2;
		}
	}
}

class Output implements Runnable {
	Resource r;
	Output(Resource r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			synchronized (r) {
				if (! (r.flag))
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println(r.name + "。。。" + r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}


public class ResourceDemo {

	public static void main(String[] args) {
		Resource r = new Resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
		
		
	}

}





