package CollectionsLi;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> strSet = new HashSet<>();//new��һ��HashSet
		strSet.add("����");
		strSet.add("����");
		strSet.add("����");
		strSet.add("����");
		
		System.out.println("strSet: " + strSet);
		System.out.println("strSet.size(): " + strSet.size());
		System.out.println("strSet���Ƿ�Ϊ��: " + strSet.isEmpty());
		System.out.println("ɾ������...");
		boolean delFlag = strSet.remove("����");
		System.out.println("ɾ�������Ƿ�ɹ� : " + delFlag);
		System.out.println("ɾ��������strSet: " + strSet);
		System.out.println("strSet���Ƿ��������:" + strSet.contains("����"));
		System.out.println("strSet���Ƿ��������:" + strSet.contains("����"));
		System.out.println("clear���Ԫ��...");
		strSet.clear();
		System.out.println("clear������strSet: " + strSet);
		System.out.println("strSet����: " + strSet.size());
		System.out.println("strSet���Ƿ�Ϊ��: " + strSet.isEmpty());
		
		
		
	}

}
