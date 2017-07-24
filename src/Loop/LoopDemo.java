package Loop;

public class LoopDemo {

	public static void main(String[] args) {
//		loopDemo1();
		loopDemo2();
		
	}

	public static void loopDemo2() {
		int line = 10;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line-1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();//»»ÐÐ
		}
	}

	public static void loopDemo1() {
		int z = 9;
 		
		for (int x = 0; x <= z; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			}
			System.out.println();//»»ÐÐ
		}
	}

}
