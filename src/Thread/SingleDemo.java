package Thread;

/*
 * 
 * 
 */
//����ʽ

class Single {
	
	private static final Single s = new Single();
	private Single(){}
	
	public static Single getInstance() {
		return s;
	}
}
//����ʽ


public class SingleDemo {

	public static void main(String[] args) {

	}

}
