package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) throws IOException {
		//서버소켓을 바인딩시킨 포트가 이미 사용중인 경우 IOException 발생
		//클라이언트의 연결요청을 청취하는 서버소켓 생성 -> 서버프로그램 가동시작
		ServerSocket server = new ServerSocket(9999);
		System.out.println("Server started...");
		while(true){
			System.out.println("Waiting for connection...");
			System.out.println("서버 시작");
			//accept()는 클라이언트의 연결요청이 오면 그 요청을 수락하고, 연결요청을 보낸 클라이언트와 통신하는 새로운 소켓객체를 만들어서 반환
			//accept()는 blocking 메소드다. 클라이언트의 연결요청이 올 때까지 실행이 지연됨
			Socket socket = server.accept();
			String clientIpAddress = socket.getInetAddress().getHostAddress();
			System.out.println("접속한 클라이언트 ip : " + clientIpAddress);
		
			//클라이언트와 데이터 교환을 하기위해 스트림 만들기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		
			//클라이언트가 보낸 메세지 수신
			//클라이언트가 메시지 보낼때까지 대기
			String message = in.readLine();
			System.out.println("[" + clientIpAddress + "] " + message);
		
			//클라이언트에 응답메세지 송신
			out.println("[서버응답] " + message);
		}
	}

}
