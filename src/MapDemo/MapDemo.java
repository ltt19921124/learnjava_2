package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		method(map);
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
//		System.out.println(map.get(6));//null
//		System.out.println(map.get(8));//xiaoming
		
		System.out.println(map);
		
	}

}
