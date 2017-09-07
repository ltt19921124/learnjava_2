package CollectionsLi;

import java.util.LinkedList;
import java.util.List;

public class TsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new LinkedList<>();
		al.add("hello");
		al.add("hello");
		al.add("world");
		al.remove("hello");
		System.out.println(al);
		
	}

}
