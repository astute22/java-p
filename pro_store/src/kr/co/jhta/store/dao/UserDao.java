package kr.co.jhta.store.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.vo.User;

public class UserDao {

	//새로운 사용자 추가
	public void addUser(User user) throws SQLException{
		util.IbatisUtils.getSqlMapClient().insert("addUser",user);
	}
	
	//모든 사용자 조회
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("getAllUsers");
	}
	
	//사용자 이름으로 조회
	@SuppressWarnings("unchecked")
	public List<User> searchUsersByName(String userName) throws SQLException{
		return util.IbatisUtils.getSqlMapClient().queryForList("searchUsersByName", userName);
	}
	
	//사용자 아이디로 조회
	public User searchUserById(String userId) throws SQLException{
		return (User) util.IbatisUtils.getSqlMapClient().queryForObject("searchUserById", userId);
	}
	
}
