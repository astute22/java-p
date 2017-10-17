package example3;

public class Quiz2 {
	public static void printMiddle(String text){
		int no = text.length()/2;
		if(no%2 == 1){
			System.out.println(text.substring(no, no+1));
		}else System.out.println(text.substring(no-1, no+1));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMiddle("full");
		printMiddle("Lingard");
		printMiddle("leister");
	}

}
