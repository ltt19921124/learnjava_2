package Lamda;

@FunctionalInterface
interface IMath {
	public int add(int x,int y);
}

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMath msg = (p1,p2) -> p1 + p2;
		System.out.println(msg.add(10, 20));
		
		
	}

}
