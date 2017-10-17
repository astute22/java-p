package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.dao.ProductDao;
import kr.co.jhta.store.vo.Product;

public class ProductApp {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

		ProductDao pDao = new ProductDao();
		Product pro = new Product();
		
		List<Product> pr1 = pDao.getAllProducts();
		for(Product p : pr1)
			System.out.println(p);
		System.out.println();
		
		List<Product> pr2 = pDao.searchProductsByName("초코파이");
		for(Product p : pr2)
			System.out.println(p);
		System.out.println();
		
		Product pr3 = pDao.searchProductByNo(1004);
		System.out.println(pr3);
		System.out.println();
		
		pr3.setQty(150);
		pDao.updateProduct(pr3);
		System.out.println(pr3);
	}

}
