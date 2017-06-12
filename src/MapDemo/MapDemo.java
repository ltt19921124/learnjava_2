package MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
//		method(map);
		method_1(map);
	}
	
	public static void method_1(Map<Integer,String>map) {
		
		map.put(8, "wangliu");
		map.put(2, "wangcai");
		map.put(7, "zhangliu");
		map.put(6, "heliu");
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		/*
		 *把map转成set就可以迭代
		 *entryset，该方法将键和值得映射关系作为对象存储到了Set集合中， 这个映射关系的
		 *类型就是Mao.Entry类型，
		 * 
		 */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key + ":::" + value);
			
		}
		
		
		//取出map中的所有元素，
		//原理是先通过keyset方法获取map中所有的键，所在的set集合，再通过set的迭代器获取每一个键
		//再对每一个键通过map集合deget方法获取其对应的值即可
		
		/*
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(value);
		}
		*/
		
		
	}

	private static void method(Map<Integer, String> map) {
		//添加元素
		System.out.println(map.put(8, "wangcai"));
		System.out.println(map.put(8, "xiaoming"));
		map.put(2, "zhansan");
		map.put(7, "zhaoliu");
		
		//删除
//		System.out.println("remove:" + map.remove(2));
		
		//判断
//		System.out.println(map.containsKey(7));
		
		//获取
//		System.out.println(map.get(6));//null 键
//		System.out.println(map.get(8));//xiaoming
		
		
		
		System.out.println(map);
		
	}

}










