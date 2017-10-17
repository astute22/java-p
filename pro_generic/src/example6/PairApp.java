package example6;

public class PairApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = new Pair<String, Integer>();
		p1.put("나이", 23);
		Pair<String, Integer> p2 = new Pair<String, Integer>();
		p2.put("나이", 23);
		//Pair<String, Double> p3 = new Pair<String, Double>();
		//p3.put("키", 174.9);
		boolean res = CommonUtil.compare(p1,p2);
		//boolean res = CommonUtil.compare(p1,p3);
		System.out.println(res);
	}

}
