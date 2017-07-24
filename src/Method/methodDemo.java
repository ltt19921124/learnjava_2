package Method;

public class methodDemo {

	public static void main(String[] args) {
		
		System.out.println(add(1,2));
		System.out.println(add(1,34,89));
		System.out.println(1.0 + 9.0);
	}
	
	public static int add(int x,int y) {
		return x + y;
	}
	
	public static int add(int x,int y,int z) {
		return x + y + z;
	}
	public static double add(double x,double y) {
		return x + y;
	}
	
}
