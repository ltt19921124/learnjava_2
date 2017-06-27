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
							r.name = "����";
							r.sex = "Ů";
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
		//������Դ
		Resource r = new Resource();
		//��������
		Input in = new Input(r);
		Output out = new Output(r);
		//�����̣߳�ִ��·��
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		//�����߳�
		t1.start();
		t2.start();
		
	}
}











