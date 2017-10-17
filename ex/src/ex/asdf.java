package ex;

import java.util.Arrays;

public class asdf {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int tmp = sc.nextInt();
		int cnt = 0;
		String tmp = "1 2 3 4 5 6 7 8 9";
		String num[] = tmp.split(" ");
		int[][] array = new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				array[j][i] = Integer.parseInt(num[cnt]);
				cnt++;	
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				if(j!=3){
					System.out.print(array[i][j]+" ");
				}else{
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}
}
