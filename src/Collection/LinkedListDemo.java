package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
	
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
//		System.out.println(link.getFirst());//��ȡ��һ������ɾ��
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//��ȡԪ�ض��һ�ɾ��
//		System.out.println(link.removeFirst());//
		
		while (!link.isEmpty()) {
			System.out.println(link.removeFirst());//�����е�Ԫ�ػ����ɾ��
		}
		
		System.out.println(link);
//		Iterator it = link.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}

}




