package Li1017;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		
		demo_read();
	}

	private static void demo_read() {
		
	}

	private static void demo_write() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("bytedemo.txt");
		//
		fos.write("abcdefg".getBytes());
		
		fos.close();
	}

}
