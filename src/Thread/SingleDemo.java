package Thread;

/*
 * 
 * 
 */
//¶öººÊ½

class Single {
	
	private static final Single s = new Single();
	private Single(){}
	
	public static Single getInstance() {
		return s;
	}
}
//ÀÁººÊ½


public class SingleDemo {

	public static void main(String[] args) {

	}

}
