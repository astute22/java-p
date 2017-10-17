package example3;

public class Quiz3 {
	public static void hideNumber(String phone){
		/*
		String[] st = phone.split("-");
		for(int i = 0; i<2;i++)
			if(st[i].length() == 2){
				st[i] = st[i].replaceAll(st[i], "**");
			}
			else if(st[i].length() == 3){
				st[i] = st[i].replaceAll(st[i], "***");
			}
			else if(st[i].length() == 4){
				st[i] = st[i].replaceAll(st[i], "****");
			}
		StringBuilder sb = new StringBuilder();
		sb.append(st[0]).append("-").append(st[1]).append("-").append(st[2]);
		System.out.println(sb);
		*/
		int c = phone.lastIndexOf("-");
		if(c == 6)
			System.out.println("**-***" + phone.substring(c));
		if(c == 8)
			System.out.println("***-****" + phone.substring(c));
		
	}
	public static void main(String[] args) {
		//전화번호의 끝 4자리 남기고 나머지번호는 *로 표시하기
		hideNumber("010-1110-1111");
		hideNumber("02-123-4567");
	}

}
