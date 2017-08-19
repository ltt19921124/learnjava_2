package Factory2;

interface IFruit {
	
	public void eat();//³ÔË®¹û
	
}

class Factory {
	public static IFruit getInstance(String className) {
		
		
		if ("apple".equals(className)) {
			return new Apple();
		}
		if ("orange".equals(className)) {
			return new Orange();
		}
		return null;
	}
}

class Apple implements IFruit {
	public void eat() {
		System.out.println("Ï÷Æ¤³ÔÆ»¹û");
	}
}

class Orange implements IFruit {
	public void eat() {
		System.out.println("°þÆ¤³ÔéÙ×Ó");
	}
}

public class TestDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		@SuppressWarnings("static-access")
//		IFruit fruit = new Factory().getInstance(args[0]);
//		fruit.eat();
		
//		@SuppressWarnings("unused")
//		int i = 9;
//		System.out.println(i);
		
		
	}

}






