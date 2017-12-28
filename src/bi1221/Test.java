package bi1221;

class TestDemo {
	
}

public class Test {
	int x = 3;
	
	public static void main(String[] args) {
//		int x = 3;
//		show(x);
//		System.out.println("x=" + x);
		Test t = new Test();
		t.x = 9;
		show(t);
		System.out.println(t.x);
	}
	
	public static void show(int a) {
		a = 4;
	}
	public static void show(Test t) {
		t.x = 4;
	}
}
