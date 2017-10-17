package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Student;

public class CourseDAO {

	// 모든 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getAllCourse() throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("course.getAllCourse");
	}
	
	//지정된 부서의 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getCourseByDept(int deptNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("course.getCourseByDept", deptNo);
	}
	
	//지정된 교수가 개설한 개설과정 조회
	@SuppressWarnings("unchecked")
	public List<Course> getCourseByProfessor(int profNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("course.getCourseByProfessor", profNo);
	}
	
	//지정된 과정번호의 개설과정 조회
	public Course getCourse(int no) throws SQLException{
		return (Course)IbatisUtils.getSqlMapClient().queryForObject("course.getCourse", no);
	}
	
	//수강신청등록시 수강인원 변동
	public void addRegNum(Course course) throws SQLException{
		IbatisUtils.getSqlMapClient().update("course.addRegNum", course);
	}
	
	//지정 학생이 현재 수강신청한 과목 조회
	@SuppressWarnings("unchecked")
	public List<Course> getCurrentRegistedCourse(int studNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("course.getCurrentRegistedCourse", studNo);
	}
	
	//과목개설
	public void addCourse(Course course) throws SQLException{
		IbatisUtils.getSqlMapClient().insert("course.addCourse", course);
	}

}
