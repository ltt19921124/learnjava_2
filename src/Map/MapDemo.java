package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
//		method(map);
		
		Map mp = Collections.synchronizedMap(map);
		mp.put(2, "a");
		System.out.println(mp.get(2));
		
	}
	
	public static void method(Map<Integer,String> map) {
		//���
//		map.put(8, "wangcI");
		map.put(8, "wangwu");//null
		map.put(2, "wangwu");//wangcai
		map.put(7, "zhaoliu");
		map.put(6, "wangcai");
		
		
		
		
		Collection<String> valus = map.values();
		
		Iterator<String> it = valus.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		/*
		 * ͨ��mapת��set�Ϳ��Ե�����entrySet()
		 * �÷�������ֵ�Ե�ӳ���ϵ�洢�������У�������map.entrySet����
		 */
		/*
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while (it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key + ":" + value); 
			
		}
		*/
		
		
		/*
		Set<Integer> keySet  = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while (it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		*/
		
//		System.out.println(map);
		@SuppressWarnings({ "rawtypes", "unused" })
		
		TreeMap tm = new TreeMap();
	}
}





