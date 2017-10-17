package example3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileTransferThread extends Thread{
	private Socket socket;
	private BufferedReader in;
	private DataOutputStream out;
	public FileTransferThread(Socket socket) {
		this.socket = socket;
	}
	public void run(){
		try{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new DataOutputStream(socket.getOutputStream());
			while(true){
				String filename = in.readLine();
				System.out.println("요청 파일명 : " + filename);
				File file = new File("c:/Temp",filename);
				out.writeUTF(System.currentTimeMillis() + file.getName());	//파일명을 클라이언트로 보내기
				out.writeLong(file.length());	//파일 사이즈를 클라이언트로보내기
				FileInputStream fis = new FileInputStream("c:/Temp/" + filename);
				int value = 0;
				while((value = fis.read())!=-1){
					out.write(value);			//파일데이터를 클라이언트로 보내기
				}
				out.flush();
				fis.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("[" + socket.getInetAddress().getHostAddress() + "] 연결끊김");
		}
	}
	
}
