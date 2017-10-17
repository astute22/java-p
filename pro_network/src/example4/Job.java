package example4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Job {
	public void fileUpload(DataInputStream in, DataOutputStream out) throws IOException{
		String filename = in.readUTF();
		long filesize = in.readLong();
		System.out.println("파일 업로드 작업 처리중");
		System.out.println("업로드 된 파일명" + filename);
		System.out.println("업로드 된 파일사이즈" + filesize);
		FileOutputStream fos = new FileOutputStream(new File("c:/Temp",filename));
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = in.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		fos.close();
	}
	public void fileDownload(DataInputStream in, DataOutputStream out) throws IOException{
		System.out.println("파일 다운로드 작업 처리중");
		String filename = in.readUTF();
		File file = new File("c:/Temp",filename);
		out.writeUTF("D");
		out.writeUTF("Success");
		out.writeUTF(filename);
		out.writeLong(file.length());
		FileInputStream fis = new FileInputStream(file);
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = fis.read(buf))!=-1){
			out.write(buf, 0, len);
		}
		fis.close();
	}
	public String[] filelist(){
		File dir = new File("c:/Temp");
		return dir.list();
	}
}
