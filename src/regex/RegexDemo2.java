package regex;

public class RegexDemo2 {

	public static void main(String[] args) {
		/*
		 * 正则表达式对字符串的常见操作
		 * 1，匹配
		 * 
		 * 2。切割
		 * 
		 * 3，替换
		 * 
		 * 5，获取
		 * 
		 */
		
	}
	
	public static void functionDemo_1() {
		//匹配手机号码是否正确
		String tel = "15809874537";
		
		String regex = "1";
		
		boolean b = tel.matches(regex);
		System.out.println(tel + ":" + b);
	}
	

}
