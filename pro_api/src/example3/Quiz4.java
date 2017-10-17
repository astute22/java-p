package example3;

public class Quiz4 {
	static String[] position = {"십","백","천","만"};
	static String[] No = {"일","이","삼","사","오","육","칠","팔","구"};
	public static void printKoreanNumber(String text){
		/*
		int num = Integer.valueOf(text);
		int tmp = num;
		int c1 = 0;
		int c2 = 1;
		while(true){
			tmp/=10;
			c1++;
			if(tmp<10)
				break;
		}
		if(num<10)c1 = 0;
		int ns[] = new int[text.length()];
		for(int i = c1; i>0;i--){
			for(int j = 0; j<i;j++){
				c2 *= 10;
			}
			ns[c1-i] = num/c2;
			num%=c2;
			c2=1;
		}
		ns[c1] = num;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<text.length();i++){
			if(ns[i]!=0){
				if((c1-i) !=0 ){
					sb.append(No[ns[i]-1]).append(position[c1-(i+1)]);
				}
			}
		}
		if(ns[c1]!=0)sb.append(No[ns[c1]-1]);
		System.out.println(sb);
		*/
		String t = "";
		for(int i=0;i<text.length();i++){
			String n = text.substring(i, i+1);
			int num = Integer.parseInt(n);
			if(num !=0 && num !=1)
				t += No[Integer.parseInt(n)-1];
			if(num !=0 && i!=3)
				t += position[position.length-i-2];
		}
		if(Integer.parseInt(text.substring(text.length()-1)) == 1){
			String n = text.substring(text.length()-1);
			t += No[Integer.parseInt(n)-1];
		}
		System.out.println(t);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKoreanNumber("5891");
		printKoreanNumber("0501");

	}

}
