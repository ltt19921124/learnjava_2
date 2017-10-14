package Li1012;

import java.io.File;
import java.io.IOException;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//
		File file = new File(".");
		//直接获取文件名，输出一点
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		//获取上一级路径
		System.out.println(file.getAbsoluteFile().getParent());
		File tmpFile = File.createTempFile("aaa", ".txt",file);
		tmpFile.deleteOnExit();
		
		//以当前时间作为新文件名来创建新文件
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile对象是否存在:" + newFile.exists());
		//以指定newFile对象来创建一个文件
		newFile.createNewFile();
		newFile.mkdir();
		
		
	}

}
