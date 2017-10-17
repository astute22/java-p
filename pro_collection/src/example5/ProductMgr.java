package example5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProductMgr {
	ArrayList<Product> productList = new ArrayList<>();
	
	
	//상품정보 전달받아서 리스트에 등록
	public void addProduct(Product p){
		productList.add(p);
	}
	//리스트에 저장된 모든 상품정보 출력
	public void printAllProduct(){
		for(Product p : productList)
			System.out.println(p.getNo() + "\t" + p.getCategory() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getPubdate());
	}
	//상품번호 전달받아서 리스트에서 상품번호에 해당하는 상품 하나를 반환
	public Product findProductByNo(int no){
		Product res = new Product();
		for(Product p : productList){
			if(p.getNo() == no){
				res = p;
			}
		}
		return res;
	}
	//상품종류 전달받아서 리스트에서 상품종류에 해당하는 상품 전부를 반환
	public ArrayList<Product> searchProductByCategory(String category){
		ArrayList<Product> results = new ArrayList<>();
		//리스트에서 상품을 하나씩 순회하면서 카테고리가 일치하는 상품을 result에 담는다
		for(Product p : productList){
			if(p.getCategory().equals(category))
				results.add(p);
		}
		return results;
	}
	//리스트에서 현재 판매중인 모든 상품정보를 반환
	public ArrayList<Product> getSellingProducts(){
		ArrayList<Product> results = new ArrayList<>();
		for(Product p : productList){
			if(!p.getIsSoldOut())
				results.add(p);
		}
		return results;
	}
	//최소/최대 가격 받아서 그 안에 속하는 모든 상품정보 반환
	public ArrayList<Product> searchProductByMinMax(int min, int max){
		ArrayList<Product> results = new ArrayList<>();
		for(Product p : productList){
			if(p.getPrice()>min && p.getPrice()<min)
				results.add(p);
		}
		return results;
	}
	//상품 이름 전달받아서 그 이름이 들어가있는 모든 상품정보 반환
	public ArrayList<Product> searchProductByName(String name){
		ArrayList<Product> results = new ArrayList<>();
		for(Product p : productList){
			if(p.getName().contains(name))
				results.add(p);
		}
		return results;
	}
	//날짜 전달 받아서 그 이름이 들어가있는 모든 상품정보 반환
	public ArrayList<Product> searchProductByDate(String date) throws Exception{
		ArrayList<Product> results = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Product p : productList){
			if(p.getPubdate().getTime() <= sdf.parse(date).getTime())
				results.add(p);
		}
		return results;
	}
}
