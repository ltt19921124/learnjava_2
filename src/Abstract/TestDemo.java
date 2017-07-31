package Abstract;

abstract class A {
	private String msg = "mkhh";
	public void print() {
		System.out.println(msg);
	}
	//
	public abstract void fun();
	
}

class B extends A {
	public void fun() {
		System.out.println("hello world!");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		
		A a = new B();
		a.fun();
		
		
	}

}
