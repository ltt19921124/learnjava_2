package bi1222;

class Person1
{
	private String name;
	private int age;
	static String country = "CN";
	public Person1(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void show()
	{
		System.out.println(Person1.country+":"+this.name+":"+this.age);
	}

	public static void method()
	{
		System.out.println(Person1.country);
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1.method();

		Person1 p = new Person1("java",20);
		p.show();
	}

}
