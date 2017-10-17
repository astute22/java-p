package example3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	//사원번호로 조회	- 1건	eployee
	public Employee findEmpByEmpId(int empId) throws Exception{
		Employee e = new Employee();
		
		StringBuilder sb = new StringBuilder();
		sb.append("select * ");
		sb.append("from employees ");
		sb.append("where employee_id = ? ");
		
		Connection con = ConnectionUtil.getconnection(); 
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setInt(1, empId);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			e.setEmpId(rs.getInt("employee_id"));
			e.setfName(rs.getString("first_name"));
			e.setlName(rs.getString("last_name"));
			e.setEmail(rs.getString("email"));
			e.setPh(rs.getString("phone_number"));
			e.setHireDate(rs.getDate("hire_date"));
			e.setJobId(rs.getString("job_id"));
			e.setSalary(rs.getDouble("salary"));
			e.setComPct(rs.getDouble("commission_pct"));
			e.setMgrId(rs.getInt("manager_id"));
			e.setDepId(rs.getInt("department_id"));
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return e;
	}
	//부서번호로 조회	- 여러건	list<Employee>
	public List<Employee> findEmpByDepId(int depId) throws Exception{
		List<Employee> res = new ArrayList<>();
	
		StringBuilder sb = new StringBuilder();
		sb.append("select * ");
		sb.append("from employees ");
		sb.append("where department_id = ? ");
		
		Connection con = ConnectionUtil.getconnection(); 
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setInt(1, depId);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			Employee e = new Employee();
			e.setEmpId(rs.getInt("employee_id"));
			e.setfName(rs.getString("first_name"));
			e.setlName(rs.getString("last_name"));
			e.setEmail(rs.getString("email"));
			e.setPh(rs.getString("phone_number"));
			e.setHireDate(rs.getDate("hire_date"));
			e.setJobId(rs.getString("job_id"));
			e.setSalary(rs.getDouble("salary"));
			e.setComPct(rs.getDouble("commission_pct"));
			e.setMgrId(rs.getInt("manager_id"));
			e.setDepId(rs.getInt("department_id"));
			res.add(e);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return res;
	}
	//급여로 조회		- 여러건	list<Employee>
	public List<Employee> findEmpBySalary(double min, double max) throws Exception{
		List<Employee> res = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("select * ");
		sb.append("from employees ");
		sb.append("where salary >= ? and salary <= ?");
		sb.append("order by salary asc");
		
		Connection con = ConnectionUtil.getconnection(); 
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setDouble(1, min);
		pstmt.setDouble(2, max);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			Employee e = new Employee();
			
			e.setEmpId(rs.getInt("employee_id"));
			e.setfName(rs.getString("first_name"));
			e.setlName(rs.getString("last_name"));
			e.setEmail(rs.getString("email"));
			e.setPh(rs.getString("phone_number"));
			e.setHireDate(rs.getDate("hire_date"));
			e.setJobId(rs.getString("job_id"));
			e.setSalary(rs.getDouble("salary"));
			e.setComPct(rs.getDouble("commission_pct"));
			e.setMgrId(rs.getInt("manager_id"));
			e.setDepId(rs.getInt("department_id"));
			
			res.add(e);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return res;
	}
	
	//직종으로 조회		- 여러건	list<Employee>
	public List<Employee> findEmpByJobId(String jobId) throws Exception{
		List<Employee> res = new ArrayList<>();
		return res;
	}
	
	//이름으로 조회		- 여러건	list<Employee>
	public List<Employee> findEmpByFirstName(String firstName) throws Exception{
		List<Employee> res = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("select * ");
		sb.append("from employees ");
		sb.append("where lower(first_name) like '%' || ? || '%' ");
		sb.append("order by first_name");
		
		Connection con = ConnectionUtil.getconnection(); 
		PreparedStatement pstmt = con.prepareStatement(sb.toString());
		pstmt.setString(1, firstName);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			Employee e = new Employee();
			e.setEmpId(rs.getInt("employee_id"));
			e.setfName(rs.getString("first_name"));
			e.setlName(rs.getString("last_name"));
			e.setEmail(rs.getString("email"));
			e.setPh(rs.getString("phone_number"));
			e.setHireDate(rs.getDate("hire_date"));
			e.setJobId(rs.getString("job_id"));
			e.setSalary(rs.getDouble("salary"));
			e.setComPct(rs.getDouble("commission_pct"));
			e.setMgrId(rs.getInt("manager_id"));
			e.setDepId(rs.getInt("department_id"));
			res.add(e);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return res;
	}
	//매니저번호로 조회	- 여러건	list<Employee>
	public List<Employee> findEmpByMgrId(int mgrId) throws Exception{
		List<Employee> res = new ArrayList<>();
		return res;
	}
	
	//전부 다 조회
	public List<Employee> printAllEmp() throws Exception{
		List<Employee> res = new ArrayList<>();
	
		
		Connection con = ConnectionUtil.getconnection(); 
		PreparedStatement pstmt = con.prepareStatement("select * from employees order by first_name asc");
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			Employee e = new Employee();
			e.setEmpId(rs.getInt("employee_id"));
			e.setfName(rs.getString("first_name"));
			e.setlName(rs.getString("last_name"));
			e.setEmail(rs.getString("email"));
			e.setPh(rs.getString("phone_number"));
			e.setHireDate(rs.getDate("hire_date"));
			e.setJobId(rs.getString("job_id"));
			e.setSalary(rs.getDouble("salary"));
			e.setComPct(rs.getDouble("commission_pct"));
			e.setMgrId(rs.getInt("manager_id"));
			e.setDepId(rs.getInt("department_id"));
			res.add(e);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return res;
	}
}
