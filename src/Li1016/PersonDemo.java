package Li1016;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
//		p.chifan();
		
		NewPerson p1 = new NewPerson(p);
//		p1.chifan();
		
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person {
	void chifan() {
		System.out.println("³Ô·¹");
	}
}

class NewPerson {
	private Person p;
	
	NewPerson(Person p) {
		this.p = p;
	}
	
	public void chifan() {
		System.out.println("¿ªÎ¸¾Æ");
		p.chifan();
		System.out.println("Ìðµã");
		
	}
	
	
}

class NewPerson2 extends Person{
	public void chifan() {
		System.out.println("¿ªÎ¸¾Æ");
		super.chifan();
		System.out.println("Ìðµã");
		
	}
}





