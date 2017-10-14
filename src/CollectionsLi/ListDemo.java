package CollectionsLi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List list = new ArrayList();
		list.add(2,"aaa");
		list.add(1, "Hello");
		list.set(0, "ccc");
		list.set(1, "World");
		System.out.println(list.get(0));
		
		Map<Person,String> map = new HashMap();
		
		
	}

}
