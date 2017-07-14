package Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(new Person("zhansan",28));
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhaoliu",25));
		ts.add(new Person("wangwu",29));
		ts.add(new Person("zhaoliu",29));
		
		Iterator it = ts.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
