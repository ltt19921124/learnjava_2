package regex;

public class RegexDemo2 {

	public static void main(String[] args) {
		/*
		 * ������ʽ���ַ����ĳ�������
		 * 1��ƥ��
		 * 
		 * 2���и�
		 * 
		 * 3���滻
		 * 
		 * 5����ȡ
		 * 
		 */
		
	}
	
	public static void functionDemo_1() {
		//ƥ���ֻ������Ƿ���ȷ
		String tel = "15809874537";
		
		String regex = "1";
		
		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}
	

}
