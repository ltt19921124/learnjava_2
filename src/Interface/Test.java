package Interface;


interface ISubject {
	public void save();//����
}

class RealSubject implements ISubject {
	public void save() {
		System.out.println("������");
	}
}

class ProxySubject implements ISubject {
	
	private ISubject subject;//��������ҵ��
	
	//��������������ʱ��Ҫ���ô������ʵ����
	
	public ProxySubject(ISubject subject) {
		this.subject = subject;
	}
	
	public void broke() {
		System.out.println("1�����Ŷ���");
	}
	public void get() {
		System.out.println("2���ý�");
	}
	
	public void save() {
		
		this.broke();//��ʵ����ǰ׼��
		
		this.subject.save();
		
		this.get();
	}
}

class Factory {
	public static ISubject getInstance() {
		return new ProxySubject(new RealSubject());
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISubject sub = Factory.getInstance();
		//ͨ����������󷢳���
		sub.save();
		
	}

}
