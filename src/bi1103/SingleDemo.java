package bi1103;

class Single {
	private static final Single s = new Single();
	
	private Single() {
		
	}
	public static Single getInstance() {
		return s;
	}
	
	
}


public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
