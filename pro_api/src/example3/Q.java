package example3;

public class Q {
	public static int resultNum(int num){
		String s = String.valueOf(num);
		int res = 1;
		for(int i = 0;i<s.length();i++){
			String t = s.substring(i, i+1);
			int n = Integer.parseInt(t);
			res *= n;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i = 10; i<=1000; i++){
			res += resultNum(i);
		}
		System.out.println(res);
	}

}
