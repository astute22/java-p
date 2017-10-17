package example7;

import java.util.HashMap;
import java.util.Map;

public class notificationApp {
	public static void main(String[] args) {
		Map<String, EventSender> map = new HashMap<>();
		map.put("M", new MailSender());
		map.put("P", new PhoneSender());
		map.put("S", new SmsSender());
		map.put("E", new EmailSender());
		
		EventNotification notice = new EventNotification(map);
		notice.sendNotice("장마철 대비 상품 할인!!", new User("안칠현", "P"));
		notice.sendNotice("장마철 대비 상품 할인!!", new User("신용재", "S"));
		notice.sendNotice("장마철 대비 상품 할인!!", new User("나얼", "E"));
		notice.sendNotice("장마철 대비 상품 할인!!", new User("민경훈", "M"));
		notice.sendNotice("바캉스 용품 대방출!!", new User("장수원", "P"));
		notice.sendNotice("바캉스 용품 대방출!!", new User("이석훈", "M"));
		
	}
}
