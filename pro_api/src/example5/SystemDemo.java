package eXample5;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시스템의 현재 시간 정보 조회
		long time = System.currentTimeMillis();
		System.out.println("현재시간 : " + time);
		
		//시스템의 프로퍼티 정보 조회
		//프로퍼티 정보 : JVM이 시작될 때 자동으로 설정되는 시스템의 속성값
		String str = System.getProperty("java.version");
		System.out.println("자바버전 : " + str);
		
		//시스템의 환경변수 정보 조회
		String str2 = System.getenv("JAVA_HOME");
		System.out.println("자바홈 : " + str2);
		String str3 = System.getenv("PATH");
		System.out.println("경로 : " + str3);
	}

}
