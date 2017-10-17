package example4;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = Math.random();
		System.out.println(num);
		
		//주사위 숫자 뽑기
		int num2 = (int)(Math.random()*6)+1;
		System.out.println(num2);
		Random random = new Random();
		int num3 = random.nextInt(6)+1;
		System.out.println(num3);
	}

}
