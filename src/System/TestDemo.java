package System;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		String str = "";
		for (int x = 0;x < 2222;x++) {
			str += x;
		}
		long end = System.currentTimeMillis();
		System.out.println("花费时间:" + (end - start));
		
		
	}

}
