package Interface;

interface IMessage {
	public void print();
}

//class MessageImpl implements IMessage {
//	public void print() {
//		System.out.println("hello world!");
//	}
//}


public abstract class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage msg = new IMessage() {
			
			public void print() {
				System.out.println("hello world!");
			}
		};
		fun(msg);
		
		
	}
	
	public static void fun(IMessage temp) {
		temp.print();
	}
	
}






