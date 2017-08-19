package quote;

@FunctionalInterface
interface IUtil<R> {
	public R zhuanhuan();
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IUtil<Integer,String> iu = String :: valueOf; //
//		IUtil<String> iu = "hello" :: toUpperCase;
//		System.out.println(iu.zhuanhuan());
		
		byte b = 10;
		System.out.println(b);
		
	}

}
