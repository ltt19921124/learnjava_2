package Li1014;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWtiter {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�����
		//������һ���ַ�д�����Ļ�����󣬲���ָ��Ҫ������������������
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
//		bufw.write("abcdef" + LINE_SEPARATOR +"hah");
//		bufw.write("abc");
//		bufw.newLine();
//		bufw.write("hehehe");
		
		for (int x = 1;x <= 4;x++) {
			bufw.write("abc" + x);
			bufw.newLine();

		}
		
		
		//ˢ����
		bufw.flush();
		
		bufw.close();
		
		
	}

}
