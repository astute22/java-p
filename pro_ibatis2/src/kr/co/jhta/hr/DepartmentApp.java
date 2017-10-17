package kr.co.jhta.hr;

import java.sql.SQLException;

import kr.co.jhta.hr.dao.DepartmentDao;
import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.service.HumanResourceService;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class DepartmentApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDao dao1 = new EmployeeDao();
		DepartmentDao dao2 = new DepartmentDao();
		
		//Employee emp = dao1.getEmployeesById(101);
		
		//새 부서정보 설정
		//Department department = new Department();
		//department.setName("교육팀");
		//department.setManager(emp);
		
		//새 부서정보 저장
		//dao2.addDepartment(department);
		Department dep = dao2.getDepartmentById(280);
		System.out.println(dep.getId());
		System.out.println(dep.getName());
		System.out.println(dep.getManager().getEmployeeId());
	}

}
