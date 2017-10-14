package Li1014;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {

		//读取已有的文本文件
		FileReader fr = new FileReader("IO流.txt");
		//创建目的地，存储已读到的数据
		FileWriter fw = new FileWriter("copytext_1.txt");
		
		//频繁的读取操作
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		//关闭流资源
		fr.close();
		fw.close();
		
	}

}
