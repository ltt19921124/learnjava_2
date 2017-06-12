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
		 *��mapת��set�Ϳ��Ե���
		 *entryset���÷���������ֵ��ӳ���ϵ��Ϊ����洢����Set�����У� ���ӳ���ϵ��
		 *���;���Mao.Entry���ͣ�
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
		
		
		//ȡ��map�е�����Ԫ�أ�
		//ԭ������ͨ��keyset������ȡmap�����еļ������ڵ�set���ϣ���ͨ��set�ĵ�������ȡÿһ����
		//�ٶ�ÿһ����ͨ��map����deget������ȡ���Ӧ��ֵ����
		
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
		//���Ԫ��
		System.out.println(map.put(8, "wangcai"));
		System.out.println(map.put(8, "xiaoming"));
		map.put(2, "zhansan");
		map.put(7, "zhaoliu");
		
		//ɾ��
//		System.out.println("remove:" + map.remove(2));
		
		//�ж�
//		System.out.println(map.containsKey(7));
		
		//��ȡ
//		System.out.println(map.get(6));//null ��
//		System.out.println(map.get(8));//xiaoming
		
		
		
		System.out.println(map);
		
	}

}










