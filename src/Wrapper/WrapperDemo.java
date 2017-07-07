package Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int num = 4;
		
		Integer i = 4;
		i = i + 6;
		
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		
		System.out.println(a == b);//false
		System.out.println(a.equals(b));//true
		
		Integer c = 12;
		Integer d = 12;
		System.out.println(c == d);//true
		System.out.println(c.equals(d));//true
		
	}

}
