package Li1012;

import java.io.File;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//
		File file = new File(".");
		//ֱ�ӻ�ȡ�ļ��������һ��
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		//��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
		File tmpFile = File.createTempFile("aaa", ".txt",file);
		tmpFile.deleteOnExit();
		
		//�Ե�ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile�����Ƿ����:" + newFile.exists());
		//��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		newFile.mkdir();
		
		
	}

}
