package bi1112;

class Resource3 {
	String name;
	String sex;
	boolean flag = false;
	
	public synchronized void set(String name,String sex) {
		if (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name = name;
		this.sex = sex;
		flag = true;
		notify();
	}
	public synchronized void out() {
		if (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name + "......" + sex);
		flag = false;
		notify();
	}
}

class Input1 implements Runnable {
	Resource3 r;
	Input1(Resource3 r) {
		this.r = r;
	}
	public void run() {
		int x = 0;
		while (true) {
			if (x == 0) {
				r.set("mike", "nan");
			} else {
				r.set("ÀöÀö", "Å®");
			}
			x = (x + 1) % 2;
		}
	}
}

class Output1 implements Runnable {
	Resource3 r;
	Output1(Resource3 r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			r.out();
		}
	}
}


public class ResourceDemo2 {

	public static void main(String[] args) {
		Resource3 r = new Resource3();
		
		Input1 in = new Input1(r);
		Output1 out = new Output1(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
		
		
	}

}





