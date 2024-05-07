package coding.practice;

import java.net.InetAddress;

public class IpAddress {
	public static void main(String[] args) {
		try {
		      InetAddress ia = InetAddress.getLocalHost();
		      String str = ia.getHostAddress();
		      System.out.println(str);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  }
}
