package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.service.SchoolService;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Dept;
import kr.co.jhta.school.vo.Professor;
import kr.co.jhta.school.vo.Student;

public class SchoolApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		SchoolService service = new SchoolService();
		List<Student> students1= service.getAllStudents();
		List<Student> students2= service.getStudentsByDept(2);
		List<Student> students3= service.getStudentsByProfessor(4);

		for(Student s : students1){
			System.out.println(s.toString());
		}
		System.out.println();
		for(Student s : students2){
			System.out.println(s.toString());
		}
		System.out.println();
		for(Student s : students3){
			System.out.println(s.toString());
		}
		System.out.println();
		List<Dept> depts1 = service.getAllDepts();
		Dept dept = service.getDeptByNo(3);
		for(Dept d : depts1){
			System.out.println(d);
		}
		System.out.println();
		System.out.println(dept);
		System.out.println();
		List<Professor> professors = service.getProfessorByDept(5);
		for(Professor p : professors){
			System.out.println(p);
		}
		System.out.println();
		Professor professor = service.getProfessor(2);
		System.out.println(professor);
		System.out.println();
		List<Course> courses = service.getCourseByDept(1);
		for(Course c : courses)
			System.out.println(c);
		
	}

}
