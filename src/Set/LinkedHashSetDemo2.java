package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet hs = new LinkedHashSet();
		
		hs.add("haha");
		hs.add("xixi");
		hs.add("hehe");
		hs.add("heihei");
//		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
