package Demo7;

public class Person {
	private String name;
	private int age;
	//
	public Person() {
		System.out.println("�޲εĹ��캯��");
	}
	
	public Person(String string, int i) {
		// TODO Auto-generated constructor stubmin
		System.out.println("�����ǣ�" + this.name + "���䣺" + this.age );
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
//
class TestPerson{
	public static void main(String[] args) {
		Person p = new Person("zhang",30);
		
	}
}





