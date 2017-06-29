package regex;

public class RegexDemo2 {

	public static void main(String[] args) {
		/*
		 * ������ʽ���ַ����ĳ�������
		 * 1��ƥ��
		 * 	matches����
		 * 2���и�
		 * 		String��split����
		 * 3���滻		
		 * 		
		 * 4����ȡ
		 * 
		 */
		functionDemo_3();
	}
	//�滻
	private static void functionDemo_3() {
		
		String str = "zhangsanttttxiaoqianmmmmmzhaoliu";
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		String tel = "15800001111";
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		
		System.out.println(tel);
	}

	//�и�
	public static void functionDemo_2() {
		
		String str = "zhangsanttttxiaoqianmmmmmzhaoliu";
		
		String[] names = str.split("(.)\\1+");//str.split("\\.");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	//ƥ��
	public static void functionDemo_1() {
		//ƥ���ֻ������Ƿ���ȷ
		String tel = "15809874537";
		
		String regex = "1[358]\\d{9}";
		
		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}
	

}






