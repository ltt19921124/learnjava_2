package Lamda;

@FunctionalInterface
interface IMessage {
	
	public default void fun() {
		System.out.println("hello");
	}
	public void print();
//	public void add();
}


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IMessage msg = new IMessage() {
//			
//			@Override
//			public void print() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello");
//			}
//		};
//		msg.print();
		//����ʽ���
		//�ӿ�ֻ����һ������
		IMessage msg = ()-> {
			System.out.println("hello");
			System.out.println("ok");
			System.out.println("ll");
		};
		msg.print();
//		msg.fun();
		
	}

}
