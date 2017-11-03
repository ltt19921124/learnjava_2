package Li1019;


public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> cls = Class.forName("java.util.Date");

		Object obj = cls.newInstance();
		System.out.println(cls.getName());
		
		String str = "abc";
		boolean b = false;
		System.out.println(b);
		
	}

}
