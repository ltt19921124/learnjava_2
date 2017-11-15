package bi1103;

class Resource {
	String name;
	String sex;
}

//����
class Input implements Runnable {
	Resource r;
	Input(Resource r) {
		this.r = r;
	}
	
	public void run() {
		int x = 0;
		
		while (true) {
			if (x == 0) {
				r.name = "mike";
				r.sex = "nan";
			}else {
				r.name = "����";
				r.sex = "ŮŮŮŮŮŮŮ";
			}
			x = (x+1) % 2;
		}
	}
}
//���
class Output implements Runnable{
	Resource r;
	Output(Resource r) {
		this.r = r;
	}
	public void run() {
		while (true) {
			System.out.println(r.name + "...." + r.sex);
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
