package bi1103;

class Person {
	Person() {
		
	}
	String name;
	int age;
	
	void speak() {
		System.out.println("my name is:" + this.name + ",age = " + this.age);
	}
}

public class TestDemo2 {

	public static void main(String[] args) {

		int x = 20, y = 30;
		boolean b;
		b = x>50&&y>60||x>50&&y<-60||x<-50&&y>60||x<-50&&y<-60;
//		System.out.println(b);//false
		
		
		Person p = new Person();
	
		
	}

}
