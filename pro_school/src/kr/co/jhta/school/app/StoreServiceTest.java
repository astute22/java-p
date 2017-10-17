package kr.co.jhta.school.app;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import kr.co.jhta.school.service.CommonService;
import kr.co.jhta.school.service.ProfessorService;
import kr.co.jhta.school.service.StudentService;
import kr.co.jhta.school.vo.Course;
import kr.co.jhta.school.vo.Registration;
import kr.co.jhta.school.vo.Student;


public class StoreServiceTest {

	@Test
	public void testOrder() throws SQLException{
		StudentService service1 = new StudentService();
		ProfessorService service2 = new ProfessorService();
		CommonService service3 = new CommonService();
		Registration registration = new Registration();
		Student student = new Student();
		student.setNo(6);
		Course course = new Course();
		course.setNo(1);
		registration.setCourse(course);
		registration.setStudent(student);
		service1.requestCourse(registration);
		Assert.assertEquals()
		
	}
}
