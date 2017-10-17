package example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("192.168.10.88", 8888);
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		
		os.write("인선\n".getBytes());
		os.flush();
		/*
		ObjectInputStream ois = new ObjectInputStream(is);
		User user = (User) ois.readObject();
		System.out.println(user);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String txt = br.readLine();
		System.out.println(txt);
	}
}
