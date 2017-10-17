package example6;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {16,23,55,22,12,87,43,65,44,52,78,5};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		String[] names = {"린가드","아자르","하메스","모라타","제라드","램파드","스콜스","이스코"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}

}
