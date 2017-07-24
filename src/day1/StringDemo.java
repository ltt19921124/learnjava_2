package day1;

public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 *String类的特点 
		 * 
		 */
//		stringDemo2();
		
		
	}

	private static void stringDemo2() {
		String s = "abc";//字符串常量池中
		
		String s1 = new String("abc");//在堆内存中new了一个字符串对象
		
		System.out.println(s == s1);//false
		System.out.println(s.equals(s1));//true
		
//		System.out.println("s=" + s);
//		System.out.println("s1=" + s1);
	}
	
	public static void stringDemo1() {
		String s = "abc";//"abc"存储在字符串常量池中
		s = "nba";
		String s1 = "abc";
		
		System.out.println(s==s1);//true
		
//		System.out.println("s=" + s);
	}

}
