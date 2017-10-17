package ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import kr.co.jhta.store.service.StoreService;
import kr.co.jhta.store.vo.Order;
import kr.co.jhta.store.vo.Product;
import kr.co.jhta.store.vo.User;

public class StoreApp {
		
	private Scanner scanner = new Scanner(System.in);
	private StoreService service = new StoreService();
	
	// title
	public void start() throws Exception  {
		System.out.println("=================================");
		System.out.println("| 편의점 관리 프로그램              |");
		System.out.println("=================================");
		
		home();
	}
	
	// 홈
	public void home() throws Exception {
		System.out.println("\n");
		System.out.println("--------------------------------------");
		System.out.println("| 1.조회	    2.주문    3.등록    0.종료 |");
		System.out.println("--------------------------------------");
		
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			search();
		} else if (menuNo == 2) {
			order();
			home();
		} else if (menuNo == 3) {
			add();
		} else if (menuNo == 0) {
			System.exit(-1);
		}
	}
	// 조회
	private void search() throws Exception {
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("| 1.사용자조회  2.상품조회  3.주문조회  0.홈 |");
		System.out.println("------------------------------------------");
		
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			searchUser();
			search();
		} else if (menuNo == 2) {
			searchProduct();
			search();
		} else if (menuNo == 3) {
			searchOrder();
			search();
		} else if (menuNo == 0) {
			home();
		} 
	}
	
	// 사용자 조회
	private void searchUser() throws SQLException {
		System.out.println("\n[사용자 조회]\n");
		
		System.out.print("사용자 이름> ");
		String username = scanner.next();
		
		// TODO 입력된 이름의 사용자정보를 모두 조회해서 화면에 표시하기
		List<User> users = service.searchUser(username);
		System.out.printf("%-10s%-10s%-20s\n","아이디","이름","전화번호");
		for(User user : users){
			System.out.printf("%-10s%-10s%-20s\n",user.getId(),user.getName(),user.getPhone());
		}
		
	}
	// 상품조회
	private void searchProduct() throws SQLException {
		System.out.println("\n[상품 조회]\n");
		
		System.out.print("상품 이름> ");
		String productName = scanner.next();
		
		// TODO 입력된 상품이름의 상품정보를 모두 조회해서 화면에 표시하기
		List<Product> products = service.searchProduct(productName);
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","상품번호","상품이름","제조사","가격","재고수량");
		for(Product prod : products){
			System.out.printf("%-10d%-10s%-10s%-10d%-10d\n",prod.getNo(),prod.getName(),prod.getMaker(),prod.getPrice(),prod.getQty());
		}
		
	}
	// 주문조회
	private void searchOrder() throws SQLException {
		System.out.println("\n[주문 조회]\n");
		
		System.out.print("사용자 아이디> ");
		String userId = scanner.next();
		
		// TODO 입력된 사용자의 주문정보를 모두 조회해서 화면에 표시하기
		List<Order> orders = service.searchOrder(userId);
		System.out.printf("%-10s%-10s%-10s%-10s\n","주문번호","고객ID","상품번호","구매수량");
		for(Order order : orders)
		{
			System.out.printf("%-10d%-10s%-10d%-10d\n",order.getNo(),order.getUser().getId(),order.getProduct().getNo(),order.getQty());
		}
		
		
	}
	
	// 주문
	private void order() throws Exception {
		System.out.println("\n[상품 주문]\n");
		
		//TODO 주문하기
		System.out.print("사용자 아이디> ");
		String userId = scanner.next();
		System.out.print("상품 번호> ");
		int productNo = scanner.nextInt();
		System.out.print("구매 수량> ");
		int qty = scanner.nextInt();
		service.orderProduct(userId, productNo, qty);
		System.out.println("주문이 완료되었습니다");
		
		
		
	}
	
	// 등록
	private void add() throws Exception {
		System.out.println("\n");
		System.out.println("------------------------------------------");
		System.out.println("| 1.사용자등록  2.상품등록  0.홈 |");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
		int menuNo = scanner.nextInt();
		
		if (menuNo == 1) {
			addUser();
			add();
		} else if (menuNo == 2) {
			addProduct();
			add();
		} else if (menuNo == 0) {
			home();
		} 
	}
	// 사용자 등록
	public void addUser() throws SQLException {
		System.out.println("\n[사용자 등록]\n");
		
		//TODO 사용자등록
		System.out.print("사용자 아이디> ");
		String userId = scanner.next();
		System.out.print("사용자 이름> ");
		String userName = scanner.next();
		System.out.print("사용자 이메일> ");
		String userEmail = scanner.next();
		System.out.print("사용자 폰번호> ");
		String userPhone = scanner.next();
		User user = new User();
		user.setId(userId);
		user.setName(userName);
		user.setEmail(userEmail);
		user.setPhone(userPhone);
		System.out.println("ID가 등록되었습니다.");
		
	}
	// 상품 등록
	public void addProduct() throws SQLException {
		System.out.println("\n[상품 등록]\n");
		
		//TODO 상품등록
		System.out.print("상품 이름> ");
		String productName = scanner.next();
		System.out.print("제조사> ");
		String productMaker = scanner.next();
		System.out.print("가격> ");
		long productPrice = scanner.nextLong();
		System.out.print("재고물량> ");
		int productQty = scanner.nextInt();
		Product product = new Product();
		product.setName(productName);
		product.setMaker(productMaker);
		product.setPrice(productPrice);
		product.setQty(productQty);
		service.addNewProduct(product);
		System.out.println("상품이 등록되었습니다");
	}
	
	public static void main(String[] args) throws Exception  {
		new StoreApp().start();
	}
}
