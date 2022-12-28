package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(">>");
			String dm = scanner.nextLine();
			if (dm.equals("exit")) {
				break;
			}
			try {
				InetAddress ipAddress = InetAddress.getByName(dm);
				System.out.println(ipAddress.getHostName() + " : " + ipAddress.getHostAddress());

			} catch (UnknownHostException e) {
				e.printStackTrace();
			}

		}

	}
}
