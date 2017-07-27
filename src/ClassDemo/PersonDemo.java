package ClassDemo;

class Person {
	
	String name;
	int age;
	
//	public Person() {
//	}
	
	public Person(String n) {
		name = n;
	}
	public Person(String n,int a) {
		this(n);
		age = a;
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


	public void info() {
		
		System.out.println("name=" + name + ",age=" + age);
		
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = null;
		p1 = new Person("lisi");
		p1.name = "ÕÅÈý";
		p1.age = 18;
		p1.info();
//		Person p2 = p1;
//		p2.name = "hdhhd";
//		p2.info();
		
		
		
	}

}
