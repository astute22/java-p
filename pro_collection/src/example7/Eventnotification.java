package example7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventNotification {

	private Map<String, EventSender> map;

	public EventNotification(Map<String, EventSender> map) {
		// TODO Auto-generated constructor stub
		this.map = map;
	}
	public void sendNotice(String message, User user){
			EventSender sender = map.get(user.getType());
			sender.sendEvent(message, user);
	}
}
