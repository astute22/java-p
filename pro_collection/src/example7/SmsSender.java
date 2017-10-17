package example7;

public class SmsSender implements EventSender{
	public void sendEvent(String message, User user){
		System.out.println("[문자안내] 수신자 : " + user.getName() + ", 내용 : " + message);
	}
}
