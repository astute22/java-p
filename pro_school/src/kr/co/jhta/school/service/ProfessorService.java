package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDAO;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Student;

public class ProfessorService {

	CourseDAO courseDAO = new CourseDAO();
	
	//신규 개설과정 등록기능
	public void addCourse(Course course) throws SQLException{
		courseDAO.addCourse(course);
	}
	
	//해당교수가 개설한 과정 조회
	public List<Course> getCourses(int profNo) throws SQLException{
		return courseDAO.getCourseByProfessor(profNo);
	}
	
	//해당 과정에 수강신청한 학생 조회하기
	public List<Student> getStudentsForCourse(int courseNo) throws SQLException{
		return null;
	}
}
