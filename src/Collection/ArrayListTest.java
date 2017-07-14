package Collection;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

/*
 * 
 * 存储自定义对象
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		//add方法参数类型是Object
		al.add(new Person("lisi1",21));//提升为了Object
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		
		Iterator it = al.iterator();
		while (it.hasNext()) {
//			System.out.println(((Person) it.next()).getName());//bean.Person@15db9742
			Person p = (Person) it.next();//一定要强转
			System.out.println(p.getName() + "--" + p.getAge());
			
		}
		
		al.add(5);//
	}

}









