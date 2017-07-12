package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		show(list);
	}

	public static void show(List<String> list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//插入元素
//		list.add(1,"abc9");
		
		//删除元素
//		System.out.println("remove:" + list.remove(2));//remove:abc3
		//修改元素
//		System.out.println("set:" + list.set(1, "abc8")); //set:abc2
		//获取元素
//		System.out.println("get:" + list.get(0));//get:abc1
		//获取子列表
//		System.out.println("subList:" + list.subList(0,3));//
		System.out.println(list);//[abc1, abc2]
		/*
		 * List是可以对元素进行增删改查
		 * 
		 */
		
	}

}











