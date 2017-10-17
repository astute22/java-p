package example1;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo3 {
	public static void main(String[] args) throws NullPointerException {
		File f = new File("c:\\jave_workspace\\oop1");
		/*
		String[] fn = f.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("java");
			}
		});
		*/
		String[] fn = f.list((dir,name)->name.endsWith("java"));
		for(String s : fn)
			System.out.println(s);
		
	}
}
