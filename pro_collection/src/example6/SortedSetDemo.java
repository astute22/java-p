package example6;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(13);
		set.add(99);
		set.add(102);
		set.add(1);
		set.add(1295);
		set.add(33);
		set.add(52);
		set.add(64);
		set.add(23);
		set.add(11);
		set.add(86);
		
		for(int num : set)
			System.out.println(num);

	}

}
