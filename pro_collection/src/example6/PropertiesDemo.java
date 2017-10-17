package example6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			Properties prop = new Properties();
		
			Class<?> clz1 = prop.getClass();
			Class<PropertiesDemo> claz2 = PropertiesDemo.class; 
			//PropertiesDemo.class -> PropertiesDemo의 설계도 정보를 얻는다.
			//getResource("파일명") -> 클래스 파일의 현재위치로부터 지정된 파일의 상대적 경로를 담고있는 URL 객체를 반환한다.
			String path = PropertiesDemo.class.getResource("database.properties").getPath();
			System.out.println(path);
		
			//지정된 경로의 파일내용을 읽어오는 FileReader 객체 생성
			FileReader reader = new FileReader(path);
			//전달받은 FileReader를 이용해서 prorerties 파일정보를 전부 읽어온다
			prop.load(reader);
			
			System.out.println(prop);
			
			String username = prop.getProperty("db.username");
			String password = prop.getProperty("db.password");
			System.out.println("유 저 명 : " + username);
			System.out.println("비밀번호 : " + password);
		
		}

}
