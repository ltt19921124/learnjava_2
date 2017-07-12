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
		ListIterator it = list.listIterator();//获取列表迭代器对象
		//它可以实现在得带过程中完成对元素的增删改查
		//注意：只有list具有该迭代功能
		
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
			//在迭代过程中，不要使用集合操作，容易出现异常
			//可以使用Iterator接口的子接口来完成在迭代中对元素进行更多的操作
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
		//通用的取出方式
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//List还有特有的取出方式,set不具备
		for (int i = 0;i < list.size();i++) {
			System.out.println("get:" + list.get(i));
		}
		
	}

}







