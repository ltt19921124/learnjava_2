package Abstract;

abstract class AA {
	public AA() {
		this.print();
	}
	public abstract void print();
	
}

class BB extends AA {
	private int num = 100;
	public BB(int num) {
		super();
		this.num = num;
	}
	
//	@Override
	public void print() {
		System.out.println(this.num);
	}
	
}

public class TestDemo2 {

	public static void main(String[] args) {
		
		new BB(30).print();
		
	}

}
