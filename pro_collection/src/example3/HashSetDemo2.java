package example3;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Integer> score = new HashSet<>();
		score.add(new Integer(50));
		score.add(60);
		score.add(42);
		score.add(new Integer(26));
		score.add(new Integer(60));
		score.add(new Integer(42));
		
		System.out.println(score);
	}
}
