package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDAO;
import kr.co.jhta.school.dao.DeptDAO;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Dept;

public class CommonService {

	DeptDAO deptDAO = new DeptDAO();
	CourseDAO courseDAO = new CourseDAO();
	
	//모든 학과 조회
	public List<Dept> getDepts() throws SQLException{
		return deptDAO.getAllDepts();
	}
	
	//지정된 학과가 개설한 과정 조회기능
	public List<Course> getCoursesByDept(int deptNo) throws SQLException{
		List<Dept> depts = deptDAO.getAllDepts();
		for(Dept d : depts){
			if(d.getNo()==deptNo){
				return courseDAO.getCourseByDept(deptNo);
			}
		}
		System.out.println("해당 학과가 존재하지 않습니다");
		return null;
	}
}
