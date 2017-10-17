package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDAO;
import kr.co.jhta.school.dao.RegistrationDAO;
import kr.co.jhta.school.dao.StudentDAO;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;

public class StudentService {

	CourseDAO courseDAO = new CourseDAO();
	RegistrationDAO registrationDAO = new RegistrationDAO();
	StudentDAO studentDAO = new StudentDAO();
	
	//수강신청
	public void requestCourse(Registration registration) throws SQLException{
		Course course = courseDAO.getCourse(registration.getCourse().getNo());
		if(course.getQuota()>course.getRegNum()){
			registrationDAO.addRegistration(registration);
			course.setRegNum(course.getRegNum()+1);
			courseDAO.addRegNum(course);
		}else System.out.println("해당 과목은 인원이 꽉 찼습니다.");
	}
	
	//수강취소 
	public void cancelCourse(Registration registration) throws SQLException{
		Course course = courseDAO.getCourse(registration.getCourse().getNo());
		registrationDAO.cancelCourse(registration.getStudent().getNo());
		course.setRegNum(course.getRegNum()-1);
		courseDAO.addRegNum(course);
	}
	
	//현재 수강중인 과목 조회
	public List<Course> getCurrentRegistedCourse(int studNo) throws SQLException{
		return courseDAO.getCurrentRegistedCourse(studNo);
	}
	
	//현재 수강신청한 과목 조회
//	public List<course> getStudentsForCourse(int courseNo) throws SQLException{
//		return null;
//	}
	
}
