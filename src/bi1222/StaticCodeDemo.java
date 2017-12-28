package bi1222;
class StaticCode
{
	static int num ;
	static 
	{
		num = 10;
//		num *=3;
		System.out.println("hahahah");
	}
	StaticCode(){}

	static void show()
	{
		System.out.println(num);
	}
}
class Person
{
	private String name;
	
	

	{//构造代码块。可以给所有对象进行初始化的。

		System.out.println("constructor code ");
//		cry();
	}
	
	static 
	{
		System.out.println("static code");
	}
	
	Person()//是给对应的对象进行针对性的初始化。 
	{
		name = "baby";
//		cry();
	}
	Person(String name)
	{
		this.name  = name;
//		cry();
	}
	public void cry()
	{
		System.out.println("哇哇");
		
	}

	public void speak()
	{
		System.out.println("name:"+name);
	}

	static void show()
	{
		System.out.println("show run");
	}
}


public class StaticCodeDemo {
	static
	{
		System.out.println("a");
	}
	
	public static void main(String[] args) {
//		Person p = null;
//		p.speak();
		
		Person.show();
		Person p1 = new Person();
		p1.speak();
		Person p2 = new Person("旺财");
		p2.speak();
		new Person();
		
	}

}
