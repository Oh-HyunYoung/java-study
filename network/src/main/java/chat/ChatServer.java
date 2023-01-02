package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {

		Scanner scanner = null;
		ServerSocket serverSocket = null;
		List<Writer> listWriters = new ArrayList<Writer>();

		try {
			// 1.키보드 연결
			scanner = new Scanner(System.in);

			// 2.socket 생성
			serverSocket = new ServerSocket();

			// 3.연결
//			String hostAddress = InetAddress.getLocalHost().getHostAddress();
			serverSocket.bind(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			System.out.println("서버: " + SERVER_IP + " IP의 클라이언트와 연결되었습니다.");

//		while (true) {
//			Socket socket = serverSocket.accept();
//			new ChatServerThread(socket, listWriters).start();
//			
			// 4.reader/writer 생성
			
//			BufferedReader br = new BufferedReader(
//					new InputStreamReader(Socket.getInputStream(), StandardCharsets.UTF_8));
//			PrintWriter pw = new PrintWriter(
//					new OutputStreamWriter(Socket.getOutputStream(), StandardCharsets.UTF_8), true);
//			OutputStream os = sersocket.getOutputStream();
//			InputStream is = socket.getInputStream();
			
			// 5.join 프로토콜
//			System.out.print("닉네임>>");
//			String nickname = scanner.nextLine();
			
			
//			if (nickname.equals(pw)) {
//				log("동일한 닉네임 입니다. 다시 입력해주세요.");
//				System.out.print("닉네임>>");
//				nickname = scanner.nextLine();
//			} else {
//				pw.println("join:" + nickname);
//				pw.flush();
//			}

			// 6. ChatClientReceiveThread 시작

			// 7. 키보드 입력 처리
			Socket Socket = serverSocket.accept();
			new ChatServerThread(Socket, listWriters).start();
		} catch (SocketException ex) {
			System.out.println("[server] suddenly closed by client");
		} catch (IOException ex) {
			log("[server] error: " + ex);
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scanner.close();

	}

	static void log(String message) {
		System.out.println("[ChatServer#" + Thread.currentThread().getId() + "] " + message);
	}

}
