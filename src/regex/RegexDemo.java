package regex;

/*
 * ������ʽ�����ڲ����ַ���
 * ͨ��һЩ�ض��ķ��������ֵġ�
 * ��������Ϊ������������ʽ������Ҫ����һЩ���š�
 * 
 * ��Ȼ���ˣ������Ķ��Ǳ���ˡ�
 * 
 * 
 * 
 */
public class RegexDemo {

	public static void main(String[] args) {
		
		
		/*
		 * ���󣺶���һ�����ܣ���qq�Ž���У��
		 * Ҫ��1,����5-15λ
		 * 2,ֻ��������
		 * 3,0���ܿ�ͷ
		 * 
		 * 
		 */
		String qq = "1234567";
		
		String regex = "[1-9][0-9]{4,14}";//������ʽ
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










