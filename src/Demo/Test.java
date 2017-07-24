package Demo;

public class Test {

	public static void main(String[] args) {
		//
		// System.out.println("ok!");
		// 10是一个整数
		// int num = 10;
		// num是int型 的变量，
		// System.out.println(num * 2);

		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;

//		System.out.println(maxValue);
//		System.out.println(minValue);
//
//		System.out.println(maxValue + 1);// 数据溢出
//		System.out.println(minValue - 1);// 数据溢出
//		System.out.println(minValue - 2);//

		long result = (long) maxValue + 1;
//		System.out.println(result);

		long result1 = maxValue;
//		System.out.println(result1 + 1);
		byte data = 10;
//		System.out.println(data);
		method();
	}

	private static void method() {
		
		float num = 2.0F;
//		System.out.println(num * 2);
		System.out.println(1.1 * 1.1);//传统bug
		
		int numA = 10;
		int numB = 4;
		System.out.println((float)numA / numB);
		
	}


}











