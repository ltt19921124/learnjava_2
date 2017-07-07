package StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
//		bufferMethodDemo_1();
		
		bufferMethodDemo_3();
		
	}

	private static void bufferMethodDemo_3() {
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);
//		sb.delete(0, sb.length());
//		sb = new StringBuffer();
		sb.setLength(10);
		System.out.println(sb);
		
	}
	

	public static void bufferMethodDemo_1() {
		//创建缓冲区对象	
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append("haha");
//		sb.append(true);
		sb.insert(1, "aa");
		System.out.println(sb);//4aahaha
	}

	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abcd");
//		sb.append("xixi");
		
		sb.insert(2, "qq");
		System.out.println(sb);
		
	}
	

}
