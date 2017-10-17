package example6;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> m = new Vector<>();
		m.add("임창정");
		m.addElement("김광석");
		m.add("김범수");
		m.add("손지창");
		m.add("안재욱");
		
		System.out.println("저장된 갯수 : " + m.size());
		System.out.println("비어있는가? " + m.isEmpty());
		for(String name : m){
			System.out.println(m);
		}
		
		Iterator<String> it = m.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
