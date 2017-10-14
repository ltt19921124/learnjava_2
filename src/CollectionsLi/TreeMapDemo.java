package CollectionsLi;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new TreeMap<Integer,String>(); 
		
		map.put(2, "C");
		map.put(0, "X");
		map.put(1, "B");
		map.put(3, "A");
		System.out.println(map);
		
	}

	
}
