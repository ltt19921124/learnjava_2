package Li1014;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWtiter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//为了提高写入的效率，使用了字符流的缓冲区
		//创建了一个字符写入流的缓冲对象，并和指定要被缓冲的流对象相关联
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		fw.write("abcde");
		
		
		
		
		fw.close();
	}

}
