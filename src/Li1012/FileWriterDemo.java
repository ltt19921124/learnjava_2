package Li1012;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�����ַ����������
		/*
		 * ����ʱȷ���ļ�
		 * 
		 */
		FileWriter fw = new FileWriter("k:\\aa\\demo.txt");
		
		/*
		 * ����Writer�����е�write(string)������д������
		 */
		fw.write("abcdefg");
//		fw.write("abc");
		fw.flush();
//		fw.write("vvv");
		
		fw.close();
		
		
	}

}
