package example4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.10.88", 9999);
		//클라이언트 -> 서버
		DataInputStream in = new DataInputStream(socket.getInputStream());
		//클라이언트<- 서버
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		//클라이언트 <- 키보드
		BufferedReader keboard = new BufferedReader(new InputStreamReader(System.in));
		//파일목록 요청하기
		//요청메세지 "L"
		out.writeUTF("L");
		
		//파일다운로드 요청하기
		//요청메세지 : "D" + "파일명"
		//out.writeUTF("D");
		System.out.print("다운로드 파일명 : ");
		String filename = keboard.readLine();
		out.writeUTF("D");
		out.writeUTF(filename);
		/*
		//파일업로드 요청하기
		//요청 메세지 : "U" + "파일명" + 파일사이즈 + 파일데이터
		System.out.print("업로드 파일 경로 : ");
		String filepath = keboard.readLine();
		File file = new File(filepath);
		String filename = file.getName();
		long filesize = file.length();
		
		out.writeUTF("U");
		out.writeUTF(filename);
		out.writeLong(filesize);
		FileInputStream fis = new FileInputStream(file);
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		fis.close();
		*/
		String responseType = in.readUTF();
		System.out.println("응답타입 : " + responseType);
		String responseResult = in.readUTF();
		System.out.println("응답결과 : " + responseResult);
		
		if("F".equals(responseType)){
			String filenames = in.readUTF();
			System.out.println(filenames);
		}else if("D".equals(responseType)){
			String filename2 = in.readUTF();
			long filesize = in.readLong();
			System.out.println("다운로드 파일명 : " + filename2);
			System.out.println("다운로드 파일크기 : " + filesize);
			FileOutputStream fos = new FileOutputStream("c:/Temp" + filename2);
			byte[] buf = new byte[1024*8];
			int len = 0;
			while((len = in.read(buf))!=-1){
				fos.write(buf,0,len);
			}
			fos.close();
		}
		if("Fail".equals(responseResult)){
			String errorMessage = in.readUTF();
			System.out.println("에러메시지 : " + errorMessage);
		}
		socket.close();
	}

}
