package Method;

public class TestDemo {

	public static void main(String[] args) {
		
//		method();
//		sum(100);
//		System.out.println(sum(100));
		System.out.println(mul(60));
	}

	public static double mul(int i) {
		if (i == 1)
			return 1;
		return i * mul(i - 1);
	}

	public static int sum(int num) {
		if (num == 1)
			return 1;
		return num + sum(num - 1);
	}
	
	
	
	public static void method() {
		int num = 100;
		int sum = 0;
		while (num >= 0) {
			sum += num;
			num--;
		}
		System.out.println(sum);
	}
	
	

}






