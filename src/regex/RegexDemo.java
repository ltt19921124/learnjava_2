package regex;

/*
 * 正则表达式：用于操作字符串
 * 通过一些特定的符号来体现的。
 * 所以我们为了掌握正则表达式，必须要掌握一些符号。
 * 
 * 虽然简化了，但是阅读星变差了。
 * 
 * 
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		
		
		/*
		 * 需求：定义一个功能，对qq号进行校验
		 * 要求：1,长度5-15位
		 * 2,只能是数字
		 * 3,0不能开头
		 * 
		 * 
		 */
		String qq = "1234567";
		
		String regex = "[1-9][0-9]{4,14}";//正则表达式
		boolean b = qq.matches(regex);
		
//		System.out.println(qq + ":" + b);
		
		String str = "aooooob";
		String reg = "ao{4,6}b";
		boolean b1 = str.matches(reg);
		System.out.println(str + ":" + b1);
		
	}
	
	public static void checkQQ(String qq) {
		int len = qq.length();
	}

}










