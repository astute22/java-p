package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.service.StoreService;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.User;

public class StoreServiceApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		StoreService ss = new StoreService();
		User user = new User();
		user.setId("hm");
		user.setName("홍진호");
		user.setEmail("hwng@naver.com");
		user.setPhone("010-2222-2222");
		ss.addNewUser(user);
		
//		ss.orderProduct("flower", 1008, 2);
//		List<Order> orders = ss.searchOrder("flower");
//		for(Order order : orders)
//			System.out.println(order);
		
	}

}
