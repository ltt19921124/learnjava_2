package Li1014;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	public static void main(String[] args) throws IOException {

		//��ȡ���е��ı��ļ�
		FileReader fr = new FileReader("IO��.txt");
		//����Ŀ�ĵأ��洢�Ѷ���������
		FileWriter fw = new FileWriter("copytext_1.txt");
		
		//Ƶ���Ķ�ȡ����
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		//�ر�����Դ
		fr.close();
		fw.close();
		
	}

}
