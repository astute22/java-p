package example3.answer;

import java.util.Random;

public class Quizz1 {
	public static void main(String[] args) {
		// ������ 3�ڸ����� �Է¹޾Ƽ�
		// �����ڸ�, �����ڸ�, ���� �ڸ��� ǥ���Ͻÿ�
		Random random = new Random();
		int number = (random.nextInt(9) + 1)*100 
					+ random.nextInt(10)*10
					+ random.nextInt(10);


		int firstNumber = number/100;	// 3
		int secondNumber = (number - firstNumber*100) /10; // 6
		int thirdNumber = number - (firstNumber*100 + secondNumber*10);

		System.out.println("������ ��: " + number);
		System.out.println("���� �ڸ���: " + firstNumber);
		System.out.println("���� �ڸ���: " + secondNumber);
		System.out.println("���� �ڸ���: " + thirdNumber);
	}
}