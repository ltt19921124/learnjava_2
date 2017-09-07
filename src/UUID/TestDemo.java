package UUID;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		UUID uuid = UUID.randomUUID();
//		System.out.println(uuid.toString());//用于上传生成文件名称
		//简单开发的时候可以用
		
		
		Base64 s;
		ArrayList al = new ArrayList();
		LinkedList l = new LinkedList();
		HashMap hs = new HashMap();
//		Hashtable hs = new Hashtable();
		
		Map map = Collections.synchronizedMap(hs);
		
		map.put(2, "aaa");
//		System.out.println(map.get(2));
		System.out.println(10 >> 1);
		
		Dictionary dc = new Hashtable();
	}

}
