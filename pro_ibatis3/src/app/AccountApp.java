package app;

import java.sql.SQLException;
import java.util.List;

import dao.AccountDAO;
import vo.AccountVO;

public class AccountApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		AccountDAO dao = new AccountDAO();
		AccountVO acc1 = new AccountVO();
		 
		/*
		acc1.setTitle("적금통장");
		acc1.setOwner("손흥민");
		acc1.setBalance(3500000);
		acc1.setRates(0.03);
		dao.addAccount(acc1);
		*/
		
		AccountVO res1 = dao.getAccountByNo(6);
		System.out.println(res1.toString());
		System.out.println();
		
		List<AccountVO> res2 = dao.getAccountByOwner("린가드");
		for(AccountVO a : res2)
			System.out.println(a.toString());
		System.out.println();
		
		List<AccountVO> res3 = dao.getAllAccount();
		for(AccountVO a : res3)
			System.out.println(a.toString());
		System.out.println();
		
		dao.deleteAccountByNo(7);
		
		List<AccountVO> res4 = dao.getAllAccount();
		for(AccountVO a : res4)
			System.out.println(a.toString());
		System.out.println();
		
	}

}
