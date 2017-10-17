package dao;

import java.sql.SQLException;
import java.util.List;

import vo.AccountVO;

public class AccountDAO {
	
	public void addAccount(AccountVO acc) throws SQLException{
		util.IbatisUtils.getSqlMapClient().insert("addAccount", acc);
	}
	
	public AccountVO getAccountByNo(int no) throws SQLException{
		return (AccountVO) util.IbatisUtils.getSqlMapClient().queryForObject("getAccountByNo", no);
	}
	
	@SuppressWarnings("unchecked")
	public List<AccountVO> getAccountByOwner(String owner) throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("getAccountByOwner", owner);
	}
	
	public void deleteAccountByNo(int no) throws SQLException{
		util.IbatisUtils.getSqlMapClient().delete("deleteAccountByNo", no);
	}
	@SuppressWarnings("unchecked")
	public List<AccountVO> getAllAccount() throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("getAllAccount");
	}

}
