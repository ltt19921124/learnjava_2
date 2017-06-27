package Thread_1;

class Resource_1 {
	private String name;
	private String sex;
	private boolean flag = false;
	
	public void set(String name,String sex) {
		this.name = name;
		this.sex = sex;
		
	}
	
	public void out() {
		System.out.println(name + "..." + sex);
	}
}

class Input_1 implements Runnable{
	
	Resource_1 r;
	Object obj = new Object();
	Input_1(Resource_1 r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		int x = 0;
			
				while (true) {
					synchronized (r) {
						if (r.flag)
							try {
								r.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						if (x == 0) {
							r.name = "mike";
							r.sex = "nan";
						} else {
							r.name = "����";
							r.sex = "Ů";
						}
						r.flag = true;
						r.notify();
					}
					x = (x + 1)%2;
				}
			
	}
}

class Output_1 implements Runnable {
	Resource_1 r;
	Object obj = new Object(); 
	Output_1(Resource_1 r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		
			
			while (true) {
				synchronized (r) {
					if (!r.flag)
						try {
							r.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					System.out.println(r.name + "..." + r.sex);
					r.flag = false;
					r.notify();
				}
			}
		
	}
	
}

public class ResourceDemo2 {

	public static void main(String[] args) {
		
		//������Դ
				Resource_1 r = new Resource_1();
				//��������
				Input_1 in = new Input_1(r);
				Output_1 out = new Output_1(r);
				//�����̣߳�ִ��·��
				Thread t1 = new Thread(in);
				Thread t2 = new Thread(out);
				//�����߳�
				t1.start();
				t2.start();

	}

}
