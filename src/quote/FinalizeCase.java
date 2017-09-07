package quote;

public class FinalizeCase {
	private static Block holder = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		holder = new Block();
		holder = null;
		System.gc();
		
		
	}
	
	static class Block {
		
		byte[] _200M = new byte[200*1024*1024];
		
	}
}
