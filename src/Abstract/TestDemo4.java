package Abstract;

//
interface IMessage {
	static final String MSG = "www.baidu.com";
	public abstract void print();
}

interface INews {
	public abstract String get();
}

class MessageImpl implements IMessage,INews {

	public String get() {
		return IMessage.MSG;
	}

	public void print() {
		System.out.println(IMessage.MSG);
	}
	
}

public class TestDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INews m = new MessageImpl();
		IMessage ms = (IMessage) m;
		System.out.println(m.get());
//		System.out.println(m instanceof MessageImpl);
		System.out.println(m.get());
		
		
//		method();
	}

	private static void method() {
		// TODO Auto-generated method stub
		
		Integer i7 = new Integer(100);
		Integer i8 = new Integer(100);
		System.out.println(i7 == i8);
		
	}

}













