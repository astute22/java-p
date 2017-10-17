package example3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("린가드");
		names.add("포그바");
		names.add("스몰링");
		names.add("데헤아");
		names.add("필존스");
		names.add("루크쇼");
		names.add("포그바");
		
		//for(String name : names)
		//	System.out.println(name);
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
				
	}

}
