package kr.co.jhta.hr;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.vo.Employee;

public class EmployeeApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDao();
		
		//List<Employee> emp = dao.getAllEmployees();
		
		//System.out.println("전체 사원 수 : " + emp.size());
		Employee e = dao.getEmployeesById(101);
		System.out.println(e.toString());

	}

}
