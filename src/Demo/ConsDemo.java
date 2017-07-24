package Demo;

class Person {
	public String name;
	private int age;

	Person() {
		System.out.println("person run");
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		super();
		this.age = age;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public void speak() {
		System.out.println(name + ":" + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class ConsDemo {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(10);
		p.setName("xiaoming");
		
		System.out.println(p.getAge() + ":" + p.getName());

	}

}
