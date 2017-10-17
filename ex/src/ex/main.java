package ex;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
		String[] nums = {"2", "9", "10", "21", "24"};
		Arrays.sort(nums);
		int cnt = nums.length-1;
		String min = nums[0];
		String max = nums[cnt];
		int tempMin = 0;
		int tempMax = 0;
		int tot=0;
		for(int i = 0; i<nums.length; i++){
			for(int j = i+1;j<nums.length; j++){
				min += nums[j];
				if(j==i+1){
					tempMin+= Integer.parseInt(min);
				}else{
					
				}
			}
		}
		for(int i = nums.length;i>0;i--){
			max += nums[i-1];
		}
		System.out.println(min);
		System.out.println(max);
		int minNum = Integer.parseInt(min);
		int maxNum = Integer.parseInt(max);
		int totNum = minNum + maxNum;
		System.out.println(totNum);
  }
}
