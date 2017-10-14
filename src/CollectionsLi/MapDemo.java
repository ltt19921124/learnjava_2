package CollectionsLi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person {
	private String name;
	private int age;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "����:" + this.name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Person) {
			Person other = (Person) obj;
			return this.age == other.age && this.name.equals(other.name);
		}
		return false;
	}
	
}

public class MapDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		ConcurrentHashMap<K, V> ch = new ConcurrentHashMap<>();
//		Map<Integer,String> map = new ConcurrentHashMap<Integer,String>();
//		map.put(3, "java");
//		map.put(2, "HELLO");
//		map.put(2, "Wrld");
//		map.put(1, "MLDN");
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> iter = set.iterator(); 
//		
//		while(iter.hasNext()) {
//			Integer key = iter.next();
//			System.out.println(key + " = " + map.get(key));
//		}
//		Random rand = new Random();
//		for (int x = 0;x < 10;x++) {
//			
//		}
	
//		map.put(1, "Hello");
//		map.put(2, "aaa");
//		//1,map����ת��ΪSet
//		Set<Map.Entry<Integer, String>> set = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> iter = set.iterator();//2,ʵ����Iterator�ӿ�
//		
//		while (iter.hasNext()) {//3,���������ȡ��ÿһ��Map.Entry����
//			Map.Entry<Integer, String> me = iter.next();//4,
//			//5,ȡ��Key �� value
//			System.out.println(me.getKey() + " = " + me.getValue());
//			
//			
//		}
//		Map<String,Person> map = new HashMap<String,Person>();
//		map.put(new String("����"),new Person("zs"));
//		
//		System.out.println(map.get(new String("����")));
		
		Map<String,Person> pm = new HashMap();
		pm.put("����", new Person("����",20));
		
		
		
	}

}







