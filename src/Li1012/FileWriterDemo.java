package Li1012;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建字符流输出对象
		/*
		 * 创建时确认文件
		 * 
		 */
		FileWriter fw = new FileWriter("k:\\aa\\demo.txt");
		
		/*
		 * 调用Writer对象中的write(string)方法，写入数据
		 */
		fw.write("abcdefg");
//		fw.write("abc");
		fw.flush();
//		fw.write("vvv");
		
		fw.close();
		
		
	}

}
