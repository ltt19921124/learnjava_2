package bi1222;

class Pers {
	String name;
	static String country = "CN";
	public void show() {
		System.out.println(Pers.country + ":" + this.name);
	}
}

public class StaticDemo {
	int num = 4;
	public static void main(String[] args) {
		Pers  p = new Pers();
		p.name = "Сǿ";
		p.show();
		System.out.println(p.country);
		System.out.println(Pers.country);
//		Pers.show();
		new StaticDemo().show();
	}
	public void show()
	{
		System.out.println(num);
	}
}
