package quote;

class Person {
	public int age;
	public String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Person)super.clone();
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}

public class TestPerson {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(23,"zhang");
		Person p1 = (Person)p.clone();
		
//		System.out.println(p);
//		System.out.println(p1);
		String result = p.getName() == p1.getName()?
				"clone是浅拷贝的":"clone是深拷贝的";
		System.out.println(result);
		
	}

}
