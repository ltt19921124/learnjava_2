package Li1014;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWtiter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�����
		//������һ���ַ�д�����Ļ�����󣬲���ָ��Ҫ������������������
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		fw.write("abcde");
		
		
		
		
		fw.close();
	}

}
