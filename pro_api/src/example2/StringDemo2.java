package example2;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//부분문자열 얻기
		//String substring(int begin) : 지정도니 시작위치부터 문자열의 끝까지 얻기
		//String substring(int begin, int end) : 지정된 시작위치와 끝위치 사이의 문자열 넣기
		//begin -> include, end -> exclude
		String txt = "Lingard@gmail.com";
		String subtxt1 = txt.substring(7);
		System.out.println("begin을 7로 지정한 경우 : " + subtxt1);
		String subtxt2 = txt.substring(8,13);
		System.out.println("begin을 8, end를 13으로 지정한 경우 : " + subtxt2);
		String subtxt3 = txt.substring(0,txt.indexOf("@"));
		System.out.println("0부터 7번째사이 문자열 얻기: " + subtxt3);
		
		//지정된 구분문자로 문자열 조각내기
		//String[] split(String 구분문자)
		String txt2 =  "훔바훔바, 로또과, 3, 남자, 30, A, 68, 182.6";
		String[] items = txt2.split(",");
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		System.out.println(items[3]);
		System.out.println(items[4]);
		System.out.println(items[5]);
		System.out.println(items[6]);
		System.out.println(items[7]);
		
		//문자열에서 지저장한 내용을 다른 내용을호 바꾼 새로운 문자열 얻기
		//String replace(String oldTxt, String newTxt) : 변경대상내용울 찾아 새로운 내용으로 변경된 문자열 반환
		//String replaceAll(String regPatten, String newTxt) : 정규표현식의 패턴과 일치하는 내용을 찾아서 새로운 내용으로 변경된 문자열 반환
		String txt3 = "제발 한국인이면 맹구 응원합시다.";
		String modifiedTxt = txt3.replace("맹구", "닭집");
		System.out.println(modifiedTxt);
		
		//다른 타입의 값을 문자열로 변경하기
		String str1 = String.valueOf(true);
		String str2 = String.valueOf(1000);
		String str3 = String.valueOf(3.14);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//대/소문자로 변경된 문자열 얻기
		String str4 = "iphone7";
		String upperTxt = str4.toUpperCase();
		System.out.println(upperTxt);
		
		//문자열의 내용이 서로 같은지 여부 확인
		String txt4 = "totenham";
		System.out.println(txt4.equals("totenham"));
		System.out.println(txt4.equals("mancity"));
		System.out.println(txt4.equalsIgnoreCase("Totenham"));
		System.out.println(txt4.equalsIgnoreCase("TOTENHAM"));
		
		//문자열을 byte[]로 변환해서 얻기
		String txt5 = "제한맨";
		byte[] bytes = txt5.getBytes();
		System.out.println(bytes.length);
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		System.out.println(bytes[4]);
		System.out.println(bytes[5]);
		System.out.println(bytes[6]);
		System.out.println(bytes[7]);
		System.out.println(bytes[8]);
		
		//bytes 배열로 문자열 만들기
		//new String(byte[] bytes)
		String txt6 = new String(bytes);
		System.out.println(txt6);
		
	}

}
