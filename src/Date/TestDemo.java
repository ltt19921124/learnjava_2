package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "1911-11-11 11:11:11.111";
//		Date date = new Date();
//		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat(str);
//		String val = sdf.format(date);
//		System.out.println(val);
		
//		System.out.println(Math.round(-15.5));//1-15
//		System.out.println(Math.round(-15.51));//-16
		Random rand = new Random();
		for (int x = 0;x < 10;x++) {
			System.out.println(rand.nextInt(100) + "¡¢ ");
		}
		
	}

}
