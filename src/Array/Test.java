package Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class A {
	void fun() {
		System.out.println("....111111...");
	}
	
	void funA() {
		System.out.println("...funA...");
	}
	
}

class B extends A {
	void fun() {
		System.out.println("...22222222...");
	}
	void funB() {
		System.out.println("...funB...");
	}
	
}

public class Test {

	public static void main(String[] args) {
		A a = new B();
//		System.out.println(a instanceof B);
		if (a instanceof B) {
			B b = (B) a;
		}
		
	}

}
