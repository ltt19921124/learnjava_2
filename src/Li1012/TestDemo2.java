package Li1012;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("TestDemo2.java");
		//创建一个长度为1024的
		byte[] buf = new byte[1024];
		
		int hasRead = 0;
		
		while ((hasRead = fis.read(buf)) > 0) {
			System.out.println(new String(buf,0,hasRead));
		}
		
		
		fis.close();
	}

}
