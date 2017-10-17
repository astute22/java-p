package example3;

import java.util.StringTokenizer;

public class Q2 {
	static String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	public static void decryptMores(String pw){
		StringTokenizer st = new StringTokenizer(pw);
		String res = null;
		while(st.hasMoreTokens()){
			String tmp = st.nextToken();
			for(int i = 0; i<26;i++){
				if(morse[i].equals(tmp)){
					res = alphabet[i];
				}
			}
			System.out.print(res);
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decryptMores(".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--");
	}

}
