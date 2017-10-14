package CollectionsLi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList();
		List<Person> list2 = new ArrayList();
		
		Person[] pArr = new Person[10];
		
		list.add(new Person("张三",21));
		list.add(new Person("李四",19));
		list.add(new Person("王五",25));
		list.add(new Person("赵六",26));
		list.add(new Person("孙七",24));
		list.add(new Person("朱八",32));
		list.add(new Person("钱九",17));
		list.add(new Person("吴十",24));
		list.add(new Person("冯十一",18));
		list.add(new Person("周十二",36));
		
		list.remove(5);
		list.remove(new Person("孙七",24));
		list.add(2, new Person("李莫愁",29));
		
		list.set(2, new Person("小龙女",20));
		
		System.out.println(list);
		
//		Person[] newPerArr = new Person[10];
//		System.arraycopy(pArr,0,newPerArr,0,pArr.length);
//		newPerArr[5] = new Person("周八");
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.out.println("list.size(): " + list.size());
//		System.out.println("list2.size(): " + list2.size());
//		System.out.println("pArr.length: " + pArr.length);
		
		
	}

	

}
