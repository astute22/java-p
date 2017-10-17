package example4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread{
		private Socket socket;
		private Job job = new Job();
		public ServerThread(Socket socket) {
			this.socket = socket;
		}
		public void run(){
			try{
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				String jobType = in.readUTF();
				if("U".equals(jobType)){
					try{
						job.fileUpload(in, out);
						out.writeUTF("M");
						out.writeUTF("Success");
						out.writeUTF("Complete");
					} catch (IOException e) {
						// TODO: handle exception
						out.writeUTF("M");
						out.writeUTF("Failed");
						out.writeUTF("Server known error");
						
					}
					out.writeUTF("M");
					out.writeUTF("Success");
				}else if("D".equals(jobType)){
					try{
						job.fileDownload(in, out);
					}catch (IOException e) {
						// TODO: handle exception
						out.writeUTF("M");
						out.writeUTF("Failed");
						out.writeUTF("Server known error");
					}
					out.writeUTF("M");
					out.writeUTF("Success");
				}else if("L".equals(jobType)){
					String[] filenames = job.filelist();
					StringBuilder sb = new StringBuilder();
					for(String filename : filenames){
						sb.append(filename);
						sb.append(System.lineSeparator());
					}
					out.writeUTF("F");
					out.writeUTF("Success");
					out.writeUTF(sb.toString());
				}else {
					out.writeUTF("M");
					out.writeUTF("Fail");
					out.writeUTF("Invalid jobtype");
				}
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
}
