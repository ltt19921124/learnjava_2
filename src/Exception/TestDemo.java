package Exception;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println(1 / 1);
		
		
		System.out.println("数学计算开始前");
		
		try {
//			int x = Integer.parseInt(args[0]);
//			int y = Integer.parseInt(args[1]);
			
			System.out.println("数学计算:" + (10 / 2));
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
//			System.out.println("异常已经被处理了 !");
		} finally {
			System.out.println("一定执行的语句");
		}
		
		
		System.out.println("数学计算结束后");
		
		
	}

}
