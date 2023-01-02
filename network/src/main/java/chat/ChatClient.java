package chat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatClient {
   
   private static Socket socket;
   private static final String IP_ADDRESS = "127.0.0.1";
   private static final int SERVER_PORT = 5000;
   public static void main(String[] args) {
      String name = null;
      Scanner scanner = new Scanner(System.in);

      
      while(true) {
         System.out.print("닉네임>>");
//         System.out.print(">>> ");
         name = scanner.nextLine();
         
         if (!name.isEmpty()) {
            break;
         }
         System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
      }
      
     
      
      socket = new Socket();
      
      try {
         socket.connect(new InetSocketAddress(IP_ADDRESS, SERVER_PORT));
         PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
         
         pw.println("join:" + name);
         
         while (true) {
				System.out.print(name+">>");
				String input = scanner.nextLine();
				System.out.print(name+"<<");

				if ("quit".equals(input) == true) {
					// 8. quit 프로토콜 처리
					break;
				} else {
					System.out.println(input);
					// 9. 메시지 처리
				}
			}
         
      } catch (SocketException e) {
         System.out.println("[Client] socket disconnected");
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if(socket != null && !socket.isClosed()) {
               socket.close();
            }
            scanner.close();
         } catch(IOException e) {
            e.printStackTrace();
         }
      }
   }
}
	   
//	   
//	   Scanner scanner = null;
////		Socket Socket = null;
//		ServerSocket serverSocket = null;
//		List<Writer> listWriters = new ArrayList<Writer>();
//
//		try {
//			// 1.키보드 연결
//			scanner = new Scanner(System.in);
//
//			// 2.socket 생성
//			serverSocket = new ServerSocket();
//			
//			// 3.연결
//			serverSocket.bind(new InetSocketAddress(SERVER_IP, SERVER_PORT));
//			System.out.println("서버: " + SERVER_IP + " IP의 클라이언트와 연결되었습니다.");
//			
//			// 4.reader/writer 생성
//			Socket Socket = serverSocket.accept();
//			new ChatServerThread(Socket, listWriters).start();
//			BufferedReader br = new BufferedReader(
//					new InputStreamReader(Socket.getInputStream(), StandardCharsets.UTF_8));
//			PrintWriter pw = new PrintWriter(new OutputStreamWriter(Socket.getOutputStream(), StandardCharsets.UTF_8),true);
//
//			// 5.join 프로토콜
//			System.out.print("닉네임>>");
//			String nickname = scanner.nextLine();
//			
//			if (nickname.equals(pw)) {
//				log("동일한 닉네임 입니다. 다시 입력해주세요.");
//				System.out.print("닉네임>>");
//				nickname = scanner.nextLine();
//			} else {
//				pw.println("join:" + nickname);
//				pw.flush();
//			}
//
//			// 6. ChatClientReceiveThread 시작
//			 
//			
//			// 7. 키보드 입력 처리
//			while (true) {
//				System.out.print(">>");
//				String input = scanner.nextLine();
//
//				if ("quit".equals(input) == true) {
//					// 8. quit 프로토콜 처리
//					break;
//				} else {
//					// 9. 메시지 처리
//				}
//			}
//		} catch (SocketException ex) {
//			System.out.println("[server] suddenly closed by client");
//		} catch (IOException ex) {
//			log("[server] error: " + ex);
//		} finally {// 10. 자원정리
//			try {
//				if (serverSocket != null && !serverSocket.isClosed()) {
//					serverSocket.close();
//				}
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		scanner.close();
//		
//	}
//   static void log(String message) {
//		System.out.println("[ChatServer#" + Thread.currentThread().getId() + "] " + message);
//	}
