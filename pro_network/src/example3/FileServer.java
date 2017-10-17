package example3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ServerSocket server = new ServerSocket(9999);){
			System.out.println("Server started.....");
			while(true){
				try{
					System.out.println("Waiting for connect");
					Socket socket = server.accept();
					FileTransferThread t = new FileTransferThread(socket);
					t.start();
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println("클라이언트와 연결 작업 중 오류 발생");
				}
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("서버소켓 생성 중 오류 발생");
			System.exit(-1);
		}
		
	}

}
