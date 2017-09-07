package Arrays;

import java.util.Arrays;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	@Override
	public int compareTo(Person o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return 0;
		}
	}
	
	
}

public class TsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] per = new Person[] {
				new Person("张三",20),
				new Person("李四",19),
				new Person("王五",21)
		};
		Arrays.sort(per);//
		System.out.println(Arrays.toString(per));
		
//		int[] dataA = new int[] {1,2,3,4,5};
//		int[] dataB = new int[] {1,2,3,4,5};
//		System.out.println(Arrays.toString(dataA));
//		System.out.println(Arrays.equals(dataA, dataB));
//		
//		System.out.println(Arrays.binarySearch(dataA, 55));//-6
		
		
	}

}
