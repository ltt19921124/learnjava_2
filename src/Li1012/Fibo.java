package Li1012;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(f(8));
	}
	
	private static int f(int x) {
		if (x == 1 || x == 2)
			return 1;
		else 
			return f(x - 1) + f(x - 2);
	}
	
	private static int sumOfFibo(int x) {
		int sum = 0;
		for (int y = 1;y <= x;y++)
			sum += f(y);
		return sum;
	}
}
