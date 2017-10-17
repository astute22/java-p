package example2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.fmkorea.com/index.php?mid=humor&page=2");
		InputStream is =  url.openStream();
		StringBuilder sb = new StringBuilder();
		byte[] buf = new byte[1024*8];
		int len = 0;
		while((len = is.read(buf))!=-1){
			String chunk = new String(buf,0,len,"euc-kr");
			sb.append(chunk);
		}
		System.out.println(sb.toString());
	}

}
