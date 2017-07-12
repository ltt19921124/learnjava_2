package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new  ArrayList();
		show(coll);
		
	}

	public static void show(Collection coll) {
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		coll.remove("abc2");
		System.out.println(coll);
	}
	

}
