package regex;

public class RegexDemo2 {

	public static void main(String[] args) {
		/*
		 * 正则表达式对字符串的常见操作
		 * 1，匹配
		 * 	matches方法
		 * 2。切割
		 * 		String的split方法
		 * 3，替换		
		 * 		
		 * 4，获取
		 * 
		 */
		functionDemo_3();
	}
	//替换
	private static void functionDemo_3() {
		
		String str = "zhangsanttttxiaoqianmmmmmzhaoliu";
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
		String tel = "15800001111";
		
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		
		System.out.println(tel);
	}

	//切割
	public static void functionDemo_2() {
		
		String str = "zhangsanttttxiaoqianmmmmmzhaoliu";
		
		String[] names = str.split("(.)\\1+");//str.split("\\.");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	//匹配
	public static void functionDemo_1() {
		//匹配手机号码是否正确
		String tel = "15809874537";
		
		String regex = "1[358]\\d{9}";
		
		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}
	

}






