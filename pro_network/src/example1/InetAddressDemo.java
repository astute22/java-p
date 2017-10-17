package example1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub
		//UnknownHostException : Hostname(연결하려고 하는 컴퓨터 이름)이 틀렸을 때 발생
		//지정된 도메인 이름에 해당하는 ip 주소 정보를 가지는 InetAddress 객체 얻기
		InetAddress inetAddress = InetAddress.getByName("www.naver.com");
		String ipAddress = inetAddress.getHostAddress();
		System.out.println("네이버 ip 주소 : " + ipAddress);
		
		InetAddress localhost = inetAddress.getLocalHost();
		String localhostIpAddess = localhost.getHostAddress();
		System.out.println("내 컴 ip주소 : " + localhostIpAddess);
	}

}
