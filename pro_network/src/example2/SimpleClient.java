package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class simpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//지정된 서버와 데이터교환을 할 소켓 생성
		//소켓이 생성되면 즉시 지정된 서버로 연결요청 보냄
		Socket socket = new Socket("192.168.10.96", 9999);
		
		//서버와 데이터 송수신을 하기 위한 스트림 생성
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//서버로 메세지 보내기
		out.println("2");
		
		//서버가 보낸 메세지 받기
		//서버가 메세지 보낼때까지 대기
		String message = in.readLine();
		System.out.println(message);
		
		socket.close();
	}

}
