package util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NSLookup { //과제

	public static void main(String[] args) {
		String line = "www.douzone.com";
		try {
			InetAddress[] inetAddress = InetAddress.getAllByName("www.douzone.com");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
