package example4;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("브라보", 30);
		map.put("포그바", 60);
		map.put("귄도간", 45);
		map.put("놀리토", 40);
		map.put("산체스", 70);
		
		int score = map.get("포그바");
		System.out.println(score);
		boolean exist = map.containsKey("브라보");
		System.out.println(exist);
		map.remove("산체스");
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			int value = map.get(key);
			System.out.println("[" + key + "] " + value);
		}
		System.out.println(map.size());
		System.out.println(map);
	}

}
