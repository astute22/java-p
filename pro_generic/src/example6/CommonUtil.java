package example6;

public class CommonUtil {
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
		boolean res1 = p1.getKey().equals(p2.getKey());
		boolean res2 = p1.getValue().equals(p2.getValue());
		return res1 && res2;
	}
}
