package Test;

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
}

public class IntegerDemo {

	public static void main(String[] args) {

//		IntegerMethod();
//		stringMethod();
//		method();
//		arrayDemo();
		stringDemo();
	}
	
	
	
	
	private static void stringDemo() {
		String str = new String("abc");
		String str1 = new String("abc");
		
		System.out.println(str.isEmpty());
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.substring(2, 3));
		System.out.println(str.equals(str1));
		
	}




	private static void arrayDemo() {
		char[] ch = {'a','ͼ'};
		String s = "";
		
		
	}




	private static void method() {
		
		String s1 = new String("100");
		String s2 = new String("100");
		System.out.println(s1.equals(s2));//true
		
		Integer itr = new Integer("123");
		Long lon = new Long("123");
		System.out.println(itr.equals(lon));//false
		
		Person p1 = new Person("����");
		Person p2 = new Person("����");
		System.out.println(p1.equals(p2));//false
		
//		Integer i = 100;
//		int a = i.intValue();
//		System.out.println(a);
		
	}




	private static void stringMethod() {
		
		String s1 = "100";//�����ַ���
		String s2 = "100";//������ַ���������ֱ����
		System.out.println(s1 == s2);//true
		
		String s3 = new String("100");//�ڶ��ڴ��д�������
		String s4 = new String("100");//�ڶ��ڴ��д�����һ������
		System.out.println(s3 == s4);//false
		
	}




	public static void IntegerMethod() {
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//true��ֱ�ӷ��ػ���õĶ���
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);//false
		
		Integer i5 = new Integer(100);
		Integer i6 = new Integer(100);
		System.out.println(i5 == i6);//false
		
		/*
		 * �����õ��˻��棬
		 */
	}

}
