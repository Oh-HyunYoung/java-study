package chat.gui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

import chat.ChatClientThread;

public class ChatClientApp {
	
	private static Socket socket;
	private static final String IP_ADDRESS = "127.0.0.1";
	private static final int SERVER_PORT = 5000;
	private String request;
	
	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		

		while( true ) {	
			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();

			if (!name.isEmpty()) {
				break;
			}
			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}		
		
		// 1. create socket 
		socket = new Socket();
		
		// 2. connect to server
		try {
			socket.connect(new InetSocketAddress(IP_ADDRESS, SERVER_PORT));
			// 3. get iostream
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));

			// 4. join protocol 진행
			pw.println("join:" + name);
			String line = br.readLine();
			if("join:ok".equals(line)) {
				new ChatWindow(name,br,pw).show();
			}
			while(true) {
				String input = scanner.nextLine();

				if ("quit".equals(input))
					break;
			}

		} catch (SocketException e) {
			System.out.println("[ClientApp] socket disconnected");
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
