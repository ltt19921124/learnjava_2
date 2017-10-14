package Li1012;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("demo.txt");
			
			fw.write("abcd\r\nbnm");
			
			fw.close();
		} catch(IOException e) {
			
			System.out.println(e.toString());
			
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException("πÿ±’ ß∞‹");
				}
			
		}
		
		
	}

}
