package String2;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "helloworld";
		char[] data = str.toCharArray();
		
		
		for (int i = 0; i < data.length; i++) {
			data[i] -= 32;
			System.out.print(data[i] + "¡¢");
		}
		System.out.println();
		//
		
		System.out.println(new String(data,5,5));//È¡¼¸¸ö
		
	}

}
