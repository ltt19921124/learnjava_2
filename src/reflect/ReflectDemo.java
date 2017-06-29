package reflect;

import java.util.Date;

/*
 *Ҫ��ȡ�ֽ����ļ�����
 *��λ�ȡ�أ�
 * 
 * 
 */

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Date date = new Date();
//		System.out.println(date.getClass());//class java.util.Date
		//�ڷ������棬��ע�Ĳ�����һ�����󣬶��Ƕ����������
		//��ȡ�ֽ����ļ�
		getClassObject_3();
	}
	
	/*
	 * ��ʽ����
	 * ֻҪͨ���������ַ��������ƾͿ��Ի�ȡ���࣬������չ
	 * �÷�������forName
	 * ���ַ�ʽֻҪ�����Ƽ��ɣ���չ�Ը�ǿ
	 */
	public static void getClassObject_3() throws ClassNotFoundException {
		
		String className = "reflect.Person";
		Class clazz = Class.forName(className); 
		System.out.println(clazz);
		
	}
	/*
	 * ��ʽ����
	 * 2.�κ��������Ͷ��߱�һ����̬������.class����ȡ���Ӧ��class����
	 * ��Լ򵥣����ǻ�����Ҫ��ȷ�õ����еľ�̬��Ա�����ǲ�����չ
	 * 
	 * 
	 * 
	 */
	private static void getClassObject_2() {
		Class clazz = Person.class;
		Class clazz1 = Person.class;
		System.out.println(clazz == clazz1);//true
		
	}
	
	/*
	 * ��ȡ�ֽ����ļ�����ķ�ʽ
	 * 1��Object���е�getClass()����
	 * ���ַ�ʽ������Ҫ��ȷ������࣬����������
	 * 
	 */
	public static void getClassObject() {
		
		Person  p =new Person();
		Class clazz = p.getClass();
		
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		
		System.out.println(clazz == clazz1);
		
	}
}











