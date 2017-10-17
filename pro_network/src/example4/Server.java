package example4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			ServerSocket server = new ServerSocket(9999);
			while(true){
				Socket socket = server.accept();
				ServerThread t = new ServerThread(socket);
				t.start();
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.exit(-1);
		}
	}

}
