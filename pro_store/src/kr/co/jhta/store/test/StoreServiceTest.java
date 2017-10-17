package kr.co.jhta.store.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import kr.co.jhta.store.dao.OrderDao;
import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.service.StoreService;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;

public class StoreServiceTest {

	@Test
	public void testOrder(){
		ProductDao productDao = new ProductDao();
		OrderDao orderDao = new OrderDao();
		StoreService service = new StoreService();
		try{
			Product prevProduct = productDao.searchProductByNo(1001);
			List<Order> prevOrderList = orderDao.searchOrdersByUserId("kong");
			service.orderProduct("kong", 1001, 10);
			
			List<Order> currentOrderList = orderDao.searchOrdersByUserId("kong");
			Product currentProduct = productDao.searchProductByNo(1001);
			
			Assert.assertEquals(currentOrderList.size(), prevOrderList.size() + 1);
			Assert.assertEquals(currentProduct.getQty(), prevProduct.getQty()-10);
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}
}
