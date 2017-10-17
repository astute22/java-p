package app;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import kr.co.jhta.store.vo.User;

public class OrderApp {

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub

		OrderDao oDao = new OrderDao();
		Order order = new Order();
		UserDao uDao = new UserDao();
		User user = new User();
		ProductDao pDao = new ProductDao();
		Product product = new Product();
		List<Product> pr1 = pDao.getAllProducts();
		List<User> u1 = uDao.getAllUsers();
		
		for(User u : u1){
			if(u.getName().equals("고유진")){
				user = u;
			}
		}
		for(Product p : pr1){
			if(p.getNo() == 1008){
				product = p;
			}
		}
		/*
		order.setUser(user);
		order.setProduct(product);
		order.setQty(5);
		oDao.addOrder(order);
		*/
		
		List<Order> or1 = oDao.searchOrdersByUserId(user.getId());
		for(Order o : or1)
			System.out.println(o);
		System.out.println();
		
		List<Order> or2 = oDao.searchOrdersByProductNo(1006);
		for(Order o : or2)
			System.out.println(o);
		System.out.println();
		
		List<Order> or3 = oDao.searchOrdersByDate("2017-07-21");
		for(Order o : or3)
			System.out.println(o);
	}

}
