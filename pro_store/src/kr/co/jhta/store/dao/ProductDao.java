package kr.co.jhta.store.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.vo.Product;

public class ProductDao {
	
	//새 상품 추가
	public void addProduct(Product product) throws SQLException{
		util.IbatisUtils.getSqlMapClient().insert("addProduct", product);
	}
	
	//모든 상품 조회
	public List<Product> getAllProducts() throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("getAllProducts");
	}
	
	//상품 이름으로 조회
	public List<Product> searchProductsByName(String ProductName) throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("searchProductsByName", ProductName);
	}
	
	//상품 번호로 조회
	public Product searchProductByNo(int productNo) throws SQLException{
		return (Product) util.IbatisUtils.getSqlMapClient().queryForObject("searchProductByNo", productNo);
	}
	
	//재고 변경
	public void updateProduct(Product product) throws SQLException{
		util.IbatisUtils.getSqlMapClient().update("updateProduct",product);
	}

}
