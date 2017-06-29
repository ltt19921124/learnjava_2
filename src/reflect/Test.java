package reflect;

public class Test {

	public static void main(String[] args) {
		boolean b = false;
		long num = 1000;
		int x = (int)num + 2;
//		System.out.println(x);
		int num1 = 50;
		num1 = num1 ++ *2;
//		System.out.println(num1);
		
		boolean flag = 10%2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
//		System.out.println(flag?"mldn" : "yootk");
		
		int i = 1;
		int j = ++i;
		System.out.println(j);
	}

}
