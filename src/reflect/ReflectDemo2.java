package reflect;

public class ReflectDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		createNewObject();
	}
	
	public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//����
		
		//����
		String name = "reflect.Person";
		//Ѱ�����ļ��������ؽ��ڴ棬������Class����
		Class clazz = Class.forName(name);
		//��β�������Ķ���
		Object obj = clazz.newInstance();
		
	}

}
