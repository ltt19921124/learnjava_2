package Li1014;

import java.io.FileReader;
import java.io.IOException;

/**
 * 自定义的读取缓冲区，模拟一个BufferedReader
 * @author ltt19
 *分析:缓冲区无非就是封装了一个数组
 *并对外提供了更多的方法对数组进行访问
 *其实这些方法最终操作的都是数组的角标
 *
 *缓冲的原理：
 *其实就是从源中获取一批数据装进缓冲区中。
 *再从缓冲区不断的取出一个一个数据
 *
 *此次取完后，再从源中继续取出一批数据进缓冲区。
 *当源中的数据取光后，用-1作为结束标记。
 *
 */
public class MyBufferedReader {
	
	private FileReader r;
	
	//定义一个数组作为缓冲区
	private char[] buf = new char[1024];
	//定义一个指针用于操作这个数组中的元素，当操作到最后一个元素后，指针应归零
	private int pos = 0;
	
	//定义一个计数器用于记录缓冲区的数据个数当该数据减到0，就从源继续获取数据到缓冲区中。
	private int count = 0;
	
	MyBufferedReader(FileReader r) {
		this.r = r;
	}
	
	

	public int myRead() throws IOException {
		if (count == 0) {
			count = r.read(buf);
			pos = 0;
		}
		if (count < 0) {
			return -1;
		}
		
		char ch = buf[pos];
		
		pos++;
		count--;
		
		return ch;
		
		/*
		//1，从源中获取一批数据到缓冲区.需要先做判断，只有计数器为0时，才需要从源中获取数据。
		if (count == 0) {
			count = r.read(buf);
			
			if (count < 0)
				return -1;
			
			//每次获取数据到缓冲区后，角标归零。
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
			
		} else if (count > 0) {
			
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
		}
		*/
		
	}
	
	public String myReadLine() throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		
		int ch = 0;
		while ((ch = myRead()) != -1) {
			if (ch=='\r')
				continue;
			if (ch=='\n')
				return sb.toString();
			//将从缓冲区中读到的字符，存储到缓冲行数据的缓冲区
			sb.append((char)ch);
			
		}
		
		if (sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
		
	}



	public void myClose() throws IOException {
		
		r.close();
		
	}
	
}







