package Li1012;

interface IMessage{}
interface IFruit{}

class Test{
	public Test() {}
	public Test(String name) {}
}
public class Person implements IMessage,IFruit{

	public static void main(String[] args) {
		Class<?> cls = Person.class;
		System.out.println(cls.getPackage().getName());
		System.out.println(cls.getSuperclass().getName());
		Class<?> itf[] = cls.getInterfaces();
		for (int x = 0;x < itf.length;x ++) {
			System.out.println(itf[x].getName());
		}
		
		
	}

}
