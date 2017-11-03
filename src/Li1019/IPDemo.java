package Li1019;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip = InetAddress.getLocalHost();
		
		//
		
		ip = InetAddress.getByName("www.baidu.com");
//		System.out.println(ip.getHostAddress());
//		System.out.println(ip.getHostName());
//		new Date() instanceof String;
		
		System.out.println(null instanceof String);
		
	}

}
