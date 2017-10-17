package example1;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("c:/Temp/test");
		f1.mkdir();
		f1.delete();
		File f2 = new File("c:/Temp/a/b/c");
		f2.mkdirs();
		f2.delete();
		File f3 = new File("c:/Temp/a.txt");
		f3.createNewFile();
	}
}
