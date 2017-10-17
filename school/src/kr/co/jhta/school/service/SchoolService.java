package kr.co.jhta.school.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.dao.CourseDAO;
import kr.co.jhta.school.dao.DeptDAO;
import kr.co.jhta.school.dao.ProfessorDAO;
import kr.co.jhta.school.dao.RegistrationDAO;
import kr.co.jhta.school.dao.StudentDAO;
import kr.co.jhta.school.dao.SubjectDAO;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Dept;
import kr.co.jhta.school.vo.Professor;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;
import kr.co.jhta.school.vo.Subject;

public class SchoolService {

	private CourseDAO courseDAO = new CourseDAO();
	private DeptDAO deptDAO = new DeptDAO();
	private ProfessorDAO professorDAO = new ProfessorDAO();
	private RegistrationDAO registrationDAO = new RegistrationDAO();
	private StudentDAO studentDAO = new StudentDAO();
	private SubjectDAO subjectDAO = new SubjectDAO();
	
	// 모든 개설과정 조회
	public List<Course> getAllCourse() throws SQLException{
		return courseDAO.getAllCourse();
	}

	//지정된 부서의 개설과정 조회
	public List<Course> getCourseByDept(int deptNo) throws SQLException{
		List<Dept> depts = deptDAO.getAllDepts();
		for(Dept d : depts){
			if(d.getNo()==deptNo){
				return courseDAO.getCourseByDept(deptNo);
			}
		}
		System.out.println("해당 학과가 존재하지 않습니다");
		return null;
	}

	//지정된 교수가 개설한 개설과정 조회
	public List<Course> getCourseByProfessor(int profNo) throws SQLException{
		return courseDAO.getCourseByProfessor(profNo);
	}

	//지정된 과정번호의 개설과정 조회
	public Course getCourse(int no) throws SQLException{
		return courseDAO.getCourse(no);
	}

	//모든 부서정보 조회
	public List<Dept> getAllDepts() throws SQLException{
		return deptDAO.getAllDepts();
	}

	//지정된 부서번호에 해당하는 부서정보 조회
	public Dept getDeptByNo(int deptno) throws SQLException{
		return deptDAO.getDeptByNo(deptno);
	}

	//지정된 부서번호에 소속된 교수정보 조회
	public List<Professor> getProfessorByDept(int deptno) throws SQLException{
		List<Dept> depts = deptDAO.getAllDepts();
		for(Dept d : depts){
			if(d.getNo()==deptno){
				return professorDAO.getProfessorByDept(deptno);
			}
		}
		System.out.println("해당 학과가 존재하지 않습니다");
		return null;
	}

	//지정된 교수번호에 해당하는 교수정보 조회
	public Professor getProfessor(int profno) throws SQLException{
		return professorDAO.getProfessor(profno);
	}

	//지정된 학생의 수강신청정보 조회
	public List<Registration> getRegistrationByStudent(int studno) throws SQLException{
		List<Student> students = studentDAO.getAllStudents();
		for(Student s : students){
			if(s.getNo() == studno){
				return registrationDAO.getRegistrationByStudent(studno);
			}
		}
		System.out.println("해당학생이 존재하지않습니다.");
		return null;
	}

	//지정된 과정의 수강신청정보 조회
	public List<Registration> getRegistrationByCourse(int courseNo) throws SQLException{
		List<Course> courses = courseDAO.getAllCourse();
		for(Course c : courses){
			if(c.getNo()==courseNo){
				return registrationDAO.getRegistrationByCourse(courseNo);
			}
		}
		System.out.println("해당 강의가 존재하지않습니다.");
		return null;
	}

	//수강신청정보 저장
	public void addRegistration(Registration registration) throws SQLException{
		Course course = courseDAO.getCourse(registration.getCourse().getNo());
		registrationDAO.addRegistration(registration);
		course.setRegNum(course.getRegNum()+1);
		courseDAO.addRegNum(course);
	}

	//모든 학생정보 조회
	public List<Student> getAllStudents() throws SQLException{
		return studentDAO.getAllStudents();
	}

	//지정된 학생번호에 해당하는 학생정보 조회
	public Student getStudentByNo(int studNo) throws SQLException{
		return studentDAO.getStudentByNo(studNo);
	}
	
	//지정된 교수번호의 교수가 지도하는 학생정보 조회
	public List<Student> getStudentsByProfessor(int profNo) throws SQLException{
		return studentDAO.getStudentsByProfessor(profNo);
	}

	//지정된 학과번호에 소속된 학생정보 조회
	public List<Student> getStudentsByDept(int deptNo) throws SQLException{
		List<Dept> depts = deptDAO.getAllDepts();
		for(Dept d : depts){
			if(d.getNo()==deptNo){
				return studentDAO.getStudentsByDept(deptNo);
			}
		}
		System.out.println("해당 학과가 존재하지 않습니다");
		return null;
	}

	//모든 정보과목 조회
	public List<Subject> getAllSubjects() throws SQLException{
		return subjectDAO.getAllSubjects();
	}

	//지정된 부서번호에 해당하는 학과의 과목정보 조회
	public List<Subject> getSubjectsByDept(int deptNo) throws SQLException{
		List<Dept> depts = deptDAO.getAllDepts();
		for(Dept d : depts){
			if(d.getNo()==deptNo){
				return subjectDAO.getSubjectsByDept(deptNo);
			}
		}
		System.out.println("해당 학과가 존재하지 않습니다");
		return null;
	}

	//지정된 과목번호에 해당하는 과목정보 조회
	public Subject getSubjectByNo(int subjectNo) throws SQLException{
		return subjectDAO.getSubjectByNo(subjectNo);
	}

}
