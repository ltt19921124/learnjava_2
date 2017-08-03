package Abstract;

abstract class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("*************");
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public abstract String getInfo();
	
}

class Student extends Person {
	private String school;
	public Student(String name,int age,String school) {
		super(name,age);
		this.school = school;
//		super();
//		System.out.println("#########");
	}
	public String getInfo() {
		return "Student name = " + super.getName() + "、age " + super.getAge() + "、school = " + this.school;
	}
	
}

public class TestDemo1 {

	public static void main(String[] args) {
		
		Person per = new Student("zhna",20,"北京大学");
		System.out.println(per.getInfo());
		
	}

}









