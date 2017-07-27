package Array;

class Person {
	private String name;
	private int age;
	
	Person(String n,int a) {
		name = n;
		age = a;
	}
	
	public String info() {
		return "姓名:" + name + ",年龄:" + age;
	}
	
}


public class ArrayDemo4 {

	public static void main(String[] args) {
//		int[] arr = {4,5,6,7,8,9};
		Person[] per = new Person[] {
				new Person("张三",21),
				new Person("李四",23),
				new Person("王五",22)
		};
		for (int i = 0; i < per.length; i++) {
			
			System.out.println(per[i].info());
			
		}
	}

}




