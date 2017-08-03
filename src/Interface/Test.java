package Interface;


interface ISubject {
	public void save();//救人
}

class RealSubject implements ISubject {
	public void save() {
		System.out.println("救人了");
	}
}

class ProxySubject implements ISubject {
	
	private ISubject subject;//真正操作业务
	
	//创建代理类对象的时候，要设置代理的真实主题
	
	public ProxySubject(ISubject subject) {
		this.subject = subject;
	}
	
	public void broke() {
		System.out.println("1、破门而入");
	}
	public void get() {
		System.out.println("2、得奖");
	}
	
	public void save() {
		
		this.broke();//真实操作前准备
		
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
		//通过代理类对象发出，
		sub.save();
		
	}

}
