package Li1014;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("IO��.txt");
			fw = new FileWriter("copytest_2.txt");
			
			//����һ����ʱ���������ڻ���������ַ�
			char[] buf = new char[BUFFER_SIZE];
			
			//����һ����������¼��ȡ�����ַ���(��������װ���ַ�����)
			int len = 0;
			while ((len = fr.read(buf)) != -1) {
				fw.write(buf,0,len);
			}
			
			
		} catch (Exception e) {
//			System.out.println("��дʧ��");
			throw new RuntimeException();
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
