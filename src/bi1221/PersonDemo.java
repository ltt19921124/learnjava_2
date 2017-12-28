package bi1221;

class Person {
	private int age;
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	void speak() {
		System.out.println("age=" + age);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
		
	}

}
