package reflect;

import java.util.Date;

/*
 *要获取字节码文件对象
 *如何获取呢？
 * 
 * 
 */

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Date date = new Date();
//		System.out.println(date.getClass());//class java.util.Date
		//在反射里面，关注的不再是一个对象，而是对象身后的组成
		//获取字节码文件
		getClassObject_3();
	}
	
	/*
	 * 方式三：
	 * 只要通过给定的字符串的名称就可以获取该类，更加扩展
	 * 该方法就是forName
	 * 这种方式只要有名称即可，扩展性更强
	 */
	public static void getClassObject_3() throws ClassNotFoundException {
		
		String className = "reflect.Person";
		Class clazz = Class.forName(className); 
		System.out.println(clazz);
		
	}
	/*
	 * 方式二：
	 * 2.任何数据类型都具备一个静态的属性.class来获取其对应的class对象
	 * 相对简单，但是还是需要明确用到类中的静态成员，还是不够扩展
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
	 * 获取字节码文件对象的方式
	 * 1，Object类中的getClass()方法
	 * 这种方式，必须要明确具体的类，并创建对象
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











