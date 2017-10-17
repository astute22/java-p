package app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.store.dao.UserDao;
import kr.co.jhta.store.vo.User;

public class UserApp {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

			UserDao uDao = new UserDao();
			User user = new User();
			
			List<User> u1 = uDao.getAllUsers();
			for(User u : u1)
				System.out.println(u.toString());
			System.out.println();
			List<User> u2 = uDao.searchUsersByName("고유진");
			for(User u : u2)
				System.out.println(u.toString());
			System.out.println();
			User u3 = uDao.searchUserById("hm");
			System.out.println(u3.toString());
	}

}
