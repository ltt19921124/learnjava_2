package day1;

public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 *String����ص� 
		 * 
		 */
//		stringDemo2();
		
		
	}

	private static void stringDemo2() {
		String s = "abc";//�ַ�����������
		
		String s1 = new String("abc");//�ڶ��ڴ���new��һ���ַ�������
		
		System.out.println(s == s1);//false
		System.out.println(s.equals(s1));//true
		
//		System.out.println("s=" + s);
//		System.out.println("s1=" + s1);
	}
	
	public static void stringDemo1() {
		String s = "abc";//"abc"�洢���ַ�����������
		s = "nba";
		String s1 = "abc";
		
		System.out.println(s==s1);//true
		
//		System.out.println("s=" + s);
	}

}
