package reflect;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		createNewObject();
	}
	
	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//早期
		
		//现在
		String name = "reflect.Person";
		//寻找类文件，并加载进内存，并产生Class对象
		Class clazz = Class.forName(name);
		//如何产生该类的对象？
		Object obj = clazz.newInstance();
		
	}

}
