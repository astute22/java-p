package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;

public class ServerThread extends Thread{
	private Set<ServerThread> set;
	private String ip;
	private String nickname;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public ServerThread(Socket socket, Set<ServerThread> set) {
		this.set = set;
		this.socket = socket;
		this.ip = socket.getInetAddress().getHostAddress();
	}
	public void run(){
		try{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			
			while(true){
				//메시지 수신 : 클라이언트 -> 서버
				String text = in.readLine();
				String[] items = text.split(":");
				if("I".equals(items[0])){
					this.nickname = items[1];
				}else if("M".equals(items[0])){
					//메세지 송신 : 모든 클라이언트 <- 서버
					broadcast("[" + nickname + " : " + ip + "]" + items[1]);	
				}else if("S".equals(items[0])){
					secretMessage(items[1],"[" + nickname + " : " + ip + "]" + items[2]);
				}
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("[" + ip + "] client disconnected");
			set.remove(this);
			try{
				broadcast(">>>>>>>>>>>>>[" + nickname + " : " + ip + "] 님이 접속을 종료하셨습니다");
			}catch (IOException e1) {
				// TODO: handle exception
			}
		}
	}
	private void broadcast(String message)throws IOException{
		for(ServerThread t : set){
			t.sendMessage(message);
		}
	}
	//메세지 송신 : 서버 -> 클라이언트
	public void sendMessage(String message) throws IOException{
		out.println(message);
	}
	//귓속말 송신 : 서버 -> 지정 클라
	public void secretMessage(String nickname, String message)throws IOException{
		for(ServerThread t : set){
			if(t.nickname.equals(nickname)){
				t.sendMessage(message);
			}
		}
	}
	
}
