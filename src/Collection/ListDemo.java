package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		show(list);
	}

	public static void show(List<String> list) {
		//���Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//����Ԫ��
//		list.add(1,"abc9");
		
		//ɾ��Ԫ��
//		System.out.println("remove:" + list.remove(2));//remove:abc3
		//�޸�Ԫ��
//		System.out.println("set:" + list.set(1, "abc8")); //set:abc2
		//��ȡԪ��
//		System.out.println("get:" + list.get(0));//get:abc1
		//��ȡ���б�
//		System.out.println("subList:" + list.subList(0,3));//
		System.out.println(list);//[abc1, abc2]
		/*
		 * List�ǿ��Զ�Ԫ�ؽ�����ɾ�Ĳ�
		 * 
		 */
		
	}

}











