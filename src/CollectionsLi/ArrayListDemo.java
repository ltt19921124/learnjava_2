package CollectionsLi;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list = new ArrayList();
		List<Person> list2 = new ArrayList();
		
		Person[] pArr = new Person[10];
		
		list.add(new Person("����",21));
		list.add(new Person("����",19));
		list.add(new Person("����",25));
		list.add(new Person("����",26));
		list.add(new Person("����",24));
		list.add(new Person("���",32));
		list.add(new Person("Ǯ��",17));
		list.add(new Person("��ʮ",24));
		list.add(new Person("��ʮһ",18));
		list.add(new Person("��ʮ��",36));
		
		list.remove(5);
		list.remove(new Person("����",24));
		list.add(2, new Person("��Ī��",29));
		
		list.set(2, new Person("С��Ů",20));
		
		System.out.println(list);
		
//		Person[] newPerArr = new Person[10];
//		System.arraycopy(pArr,0,newPerArr,0,pArr.length);
//		newPerArr[5] = new Person("�ܰ�");
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.out.println("list.size(): " + list.size());
//		System.out.println("list2.size(): " + list2.size());
//		System.out.println("pArr.length: " + pArr.length);
		
		
	}

	

}
