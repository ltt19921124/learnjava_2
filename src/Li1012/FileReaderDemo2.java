package Li1012;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		
		/*
		 * 使用read(char[])读取文本文件数据
		 */
		
		char[] buf = new char[1024];
		
		
//		int num = fr.read(buf);//
//		System.out.println(new String(buf));
		int len = 0;
		
		while ((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		
		
		
		fr.close();
		
	}

}




