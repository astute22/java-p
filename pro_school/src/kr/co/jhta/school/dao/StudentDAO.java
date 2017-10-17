package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Student;

public class StudentDAO {

	//모든 학생정보 조회
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("student.getAllStudents");
	}
	
	//지정된 학생번호에 해당하는 학생정보 조회
	public Student getStudentByNo(int studNo) throws SQLException{
		return (Student)IbatisUtils.getSqlMapClient().queryForList("student.getStudentByNo", studNo);
	}
	
	//지정된 교수번호의 교수가 지도하는 학생정보 조회
	@SuppressWarnings("unchecked")
	public List<Student> getStudentsByProfessor(int profNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("student.getStudentsByProfessor", profNo);
	}
	
	//지정된 학과번호에 소속된 학생정보 조회
	@SuppressWarnings("unchecked")
	public List<Student> getStudentsByDept(int deptNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("student.getStudentsByDept", deptNo);
	}
	
	//현재 수강신청한 과목 조회
	@SuppressWarnings("unchecked")
	public List<Student> getStudentsForCourse(int courseNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("student.getStudentsForCourse", courseNo);
	}
}
