package Runtime;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(foo(7));
//		System.out.println(foo_1(7));
		
		Runtime run = Runtime.getRuntime();
		System.out.println("MAX = " + run.maxMemory());
		System.out.println("TOTAL = " + byteToM(run.totalMemory()));
		System.out.println("FREE = " + run.freeMemory());
		
		String str = "";
		
	}
	
	public static double byteToM(long num) {
		return (double) (num / 1024 / 1024);
	}
	//求和
	public static int foo_1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += foo(i);
		}
		return sum;
	}
	//斐波那契数列
	public static int foo(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return foo(n - 1) + foo(n - 2);
		}
	}
}
