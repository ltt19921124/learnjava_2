package Li1014;

import java.io.FileReader;
import java.io.IOException;

/**
 * �Զ���Ķ�ȡ��������ģ��һ��BufferedReader
 * @author ltt19
 *����:�������޷Ǿ��Ƿ�װ��һ������
 *�������ṩ�˸���ķ�����������з���
 *��ʵ��Щ�������ղ����Ķ�������ĽǱ�
 *
 *�����ԭ��
 *��ʵ���Ǵ�Դ�л�ȡһ������װ���������С�
 *�ٴӻ��������ϵ�ȡ��һ��һ������
 *
 *�˴�ȡ����ٴ�Դ�м���ȡ��һ�����ݽ���������
 *��Դ�е�����ȡ�����-1��Ϊ������ǡ�
 *
 */
public class MyBufferedReader {
	
	private FileReader r;
	
	//����һ��������Ϊ������
	private char[] buf = new char[1024];
	//����һ��ָ�����ڲ�����������е�Ԫ�أ������������һ��Ԫ�غ�ָ��Ӧ����
	private int pos = 0;
	
	//����һ�����������ڼ�¼�����������ݸ����������ݼ���0���ʹ�Դ������ȡ���ݵ��������С�
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
		//1����Դ�л�ȡһ�����ݵ�������.��Ҫ�����жϣ�ֻ�м�����Ϊ0ʱ������Ҫ��Դ�л�ȡ���ݡ�
		if (count == 0) {
			count = r.read(buf);
			
			if (count < 0)
				return -1;
			
			//ÿ�λ�ȡ���ݵ��������󣬽Ǳ���㡣
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
			//���ӻ������ж������ַ����洢�����������ݵĻ�����
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







