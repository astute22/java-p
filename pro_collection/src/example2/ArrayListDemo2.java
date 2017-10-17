package example2;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("린가드");
		names.add("루니");
		names.add("데헤아");
		boolean exist = names.contains("데헤아");
		System.out.println(exist);
	}

}
