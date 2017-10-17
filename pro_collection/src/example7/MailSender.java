package example7;

public class MailSender implements EventSender {
	public void sendEvent(String message, User user){
		System.out.println("[우편발송] 수신자 : " + user.getName() + ", 내용 : " + message);
	}
}
