package example7;

public class EmailSender implements EventSender {
	public void sendEvent(String message, User user){
		System.out.println("[Email 발송] 수신자 : " + user.getName() + ", 내용 : " + message);
	}
}
