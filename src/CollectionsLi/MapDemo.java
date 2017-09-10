package CollectionsLi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Hello");
		map.put(2, "aaa");
		//1,map集合转变为Set
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = set.iterator();//2,实例化Iterator接口
		
		while (iter.hasNext()) {//3,迭代输出，取出每一个Map.Entry对象
			Map.Entry<Integer, String> me = iter.next();//4,
			//5,取得Key 和 value
			System.out.println(me.getKey() + " = " + me.getValue());
			
			
		}
		
	}

}

