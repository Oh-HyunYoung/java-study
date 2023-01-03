package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ChatServerThread extends Thread {
	private String nickname;
	private Socket socket;
	BufferedReader br = null;
	PrintWriter pw = null;

	List<Writer> listWriters = new ArrayList<Writer>();

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		// 1. Remote Host Information
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {
		String request;

		try {
			// 2. 스트림 얻기
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);

			// 3. 요청 처리
			// 4. 프로토콜 분석
			while (true) {
				request = br.readLine();
				if (request == null) {
					log("클라이언트로부터 연결 끊김");
					doQuit(pw);
					break;
				}
				String[] tokens = request.split(":");

				if ("join".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1]);
				} else if ("quit".equals(tokens[0])) {
					doQuit(pw);
				}
			}
		} catch (IOException e) {
			log("채팅방을 나갔습니다.");
		}

	}

	private void broadcast(String data) {

		synchronized (listWriters) {
			for (Writer writer : listWriters) {
				PrintWriter printWriter = (PrintWriter) writer;
				printWriter.println(data);
				printWriter.flush();
			}
		}
	}

	private void doJoin(String nickName, Writer writer) throws IOException {
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

		// writer pool에 저장
		addWriter(writer);

		// ack
		((PrintWriter) writer).println("join:ok");
		writer.flush();
	}

	private void doQuit(Writer writer) throws IOException {
		removeWriter(writer);
		String data = nickname + "님이 퇴장하였습니다.";
		broadcast(data);
	}

	private void removeWriter(Writer writer) {
		listWriters.remove(writer);
	}

	private void doMessage(String message) throws IOException {
		String data = nickname + ":" + message;
		broadcast(data);
	}

	private void addWriter(Writer writer) throws IOException {
		synchronized (listWriters) {
			listWriters.add(writer);
		}
	}

	private static void log(String message) {
		System.out.println("[ChatServerThread#" + Thread.currentThread().getId() + "] " + message);
	}
}
