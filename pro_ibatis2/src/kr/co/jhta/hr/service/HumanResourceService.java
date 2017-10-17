package kr.co.jhta.hr.service;

import java.sql.SQLException;

import kr.co.jhta.hr.dao.DepartmentDao;
import kr.co.jhta.hr.dao.EmployeeDao;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class HumanResourceService {

	private DepartmentDao deptDao = new DepartmentDao();
	private EmployeeDao empDao = new EmployeeDao();
	
	public Department getDetailDepartment(int id) throws SQLException{
		
		// 부서 정보 조회(부서아이디, 부서이름, 관리자 사원아이디, 위치 아이디)
		Department department = deptDao.getDepartmentById(id);
		if(department == null){
			return null;
		}
		
		//
		int employeeId = department.getManager().getEmployeeId();
		Employee employee = empDao.getEmployeesById(employeeId);
		
		department.setManager(employee);
		
		return department;
	}
}
