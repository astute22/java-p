package example3;

import java.util.HashSet;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto = new HashSet<>();
		Random random = new Random();
		
		while (true){
			lotto.add(random.nextInt(45) + 1);
			if(lotto.size()==6)
				break;
		}
		System.out.println(lotto);

	}

}
