package example1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("c:/jave_workspace/oop1");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File[] fs = f.listFiles((dir,name)->name.endsWith("java"));
		for(File it : fs)
		{
			Date d = new Date(it.lastModified());
			System.out.println(it.getName() + "\t" + it.length() + "\t" + sdf.format(d));
		}
	}

}
