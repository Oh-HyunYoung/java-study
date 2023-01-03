package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.SocketException;

public class ChatClientThread extends Thread {
	private BufferedReader bufferedReader;

	public ChatClientThread(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}

	public void run() {
		try {
			String str = null;
			while (true) {
				str = bufferedReader.readLine();
				System.out.println(str);
			}

		} catch (SocketException ex) {
			System.out.println("채팅이 종료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
