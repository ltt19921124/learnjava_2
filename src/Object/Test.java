package Object;

class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (this == anObject) {
			return true;
		}
		if (!(anObject instanceof Person)) {
			return false;
		}
		Person per = (Person)anObject;
		return this.name.equals(per.name) && this.age == per.age;
	}
	
	public String toString() {
		return "姓名:" + this.name + "、age:" + this.age;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		fun("hello");
//		fun(new Person("张三",20));
		Person per1 = new Person("张三",20);
		Person per2 = new Person("张三",20);
		System.out.println(per1.equals(per2));
		
	}
	
	public static void fun(Object obj) {
		
		System.out.println(obj.toString());
		
	}
}





