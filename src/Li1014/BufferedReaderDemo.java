package Li1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("buf.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
//		System.out.println(line1);
		
		while (((line = bufr.readLine()) != null)) {
			System.out.println(line);
		}
		
		
		bufr.close();
		
		
	}

	public static void Demo() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("buf.txt");
		
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
			
		}
		fr.close();
	}

}
