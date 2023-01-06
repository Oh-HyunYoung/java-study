package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {

	private static Socket socket;
	private static final String IP_ADDRESS = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);

		socket = new Socket();

		while (true) {
			System.out.print("닉네임을 입력해주세요>>");
			name = scanner.nextLine();

			if (!name.isEmpty()) {
				break;
			}
			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}

		try {
			socket.connect(new InetSocketAddress(IP_ADDRESS, SERVER_PORT));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			
			pw.println("join:" + name);
			new ChatClientThread(br).start();
			
			while (true) {
				String input = scanner.nextLine();
				pw.println("message:" + input);
				
				if ("quit".equals(input))
					break;
			}

		} catch (SocketException e) {
			System.out.println("[Client] socket disconnected");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}