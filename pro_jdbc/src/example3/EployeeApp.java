package example3;

import java.util.List;

public class EployeeApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		
		//Employee e = dao.findEmpByEmpId(209);
		//System.out.println(e.toString());
		
		//List<Employee> le = dao.findEmpBySalary(1000, 3000);
		//for(Employee e1 : le)
			//System.out.println(e1.toString());
		
		List<Employee> le = dao.findEmpByFirstName("at");
		for(Employee e1 : le)
			System.out.println(e1.toString());
		
		//List<Employee> le = dao.printAllEmp();
		//for(Employee e1 : le)
			//System.out.println(e1.toString());
	}

}
