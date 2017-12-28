package bi1222;

class Person2
{
	private String name;
	private int age;	
	Person2()
	{		
		name = "baby";
		age = 1;
		System.out.println("person run");
	}	
	Person2(String name)	
	{
		this();
		this.name = name;
	}
	Person2(String name,int age)
	{
		this.name = name;
		this.age = age;		
	}
	public void speak()
	{
		System.out.println(this.name+":"+this.age);
	}

	/*
	判断是否是同龄人。
	*/
	public boolean compare(Person2 p)
	{
		/*
		if(this.age==p.age)
			return true;
		else
			return false;
		*/
		return this.age==p.age;
	}

}

public class ThisDemo {

	public static void main(String[] args) {
		Person2 p1 = new Person2("aa",30);//
		Person2 p2 = new Person2("zz",12);

		System.out.println(p2.compare(p1));

	}

}
