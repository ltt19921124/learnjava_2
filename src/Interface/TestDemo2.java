package Interface;

interface IMessage1 {
	
}

class MessageImpl implements IMessage1 {
	public String toString() {
		
		return "www.baidu.com";
	}
}


public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage1 msg = new MessageImpl();
		
		Object obj = msg;
		System.out.println(obj);
		
		
	}

}
