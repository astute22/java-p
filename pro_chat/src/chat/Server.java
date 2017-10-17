package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server {
	Set<ServerThread> set = new HashSet<>();
	public Server() {
		// TODO Auto-generated constructor stub
		ServerSocket serverSocket = null;
		try{
			serverSocket = new ServerSocket(9999);
			System.out.println("Server started....");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Server Error - init");
			System.exit(-1);
		}
		while(true){
			try{
				System.out.println("Waiting for connect....");
				Socket socket = serverSocket.accept();
				System.out.println("Client connected - [" + socket.getInetAddress().getHostAddress() + "]");
				ServerThread t = new ServerThread(socket,set);
				set.add(t);
				t.start();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
