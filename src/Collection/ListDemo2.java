package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
//		show(list);
//		show_1();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		System.out.println("list:" + list);
		ListIterator it = list.listIterator();//��ȡ�б����������
		//������ʵ���ڵô���������ɶ�Ԫ�ص���ɾ�Ĳ�
		//ע�⣺ֻ��list���иõ�������
		
		while (it.hasNext()) {
			Object obj = it.next();
			
			if (obj.equals("abc2")) {
				it.set("abc9");
			}
		}
//		System.out.println("next:" + it.hasNext());
//		System.out.println("hasPrevious:" + it.hasPrevious());
		
		while (it.hasPrevious()) {
			System.out.println("previous:" + it.previous());
		}
		
		System.out.println("list:" + list);
		
		/*
		Iterator it = list.iterator();
		while (it.hasNext()) {
			
			Object obj = it.next();//java.util.ConcurrentModificationException
			//�ڵ��������У���Ҫʹ�ü��ϲ��������׳����쳣
			//����ʹ��Iterator�ӿڵ��ӽӿ�������ڵ����ж�Ԫ�ؽ��и���Ĳ���
			if (obj.equals("abc2")) {
				list.add("abc9");
			} else {
				System.out.println("next:" + obj);
			}
		}
		*/
//		System.out.println(it.next());
		
	}

	private static void show_1() {
		int[] arr = {3,4,5};
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void show(List list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		//ͨ�õ�ȡ����ʽ
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//List�������е�ȡ����ʽ,set���߱�
		for (int i = 0;i < list.size();i++) {
			System.out.println("get:" + list.get(i));
		}
		
	}

}







