package example7;

public class CourseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person> personCourse = new Course<>("일반인과정",10);
		Course<Worker> workerCourse = new Course<>("직장인과정",10);
		Course<Student> studentCourse = new Course<>("학생과정",10);
		Course<CollegeStudent> collegeStudentCourse = new Course<>("대학생과정",10);
		
		CourseManagement mgr = new CourseManagement();
		mgr.registerCourse(personCourse);
		mgr.registerCourse(workerCourse);
		mgr.registerCourse(studentCourse);
		mgr.registerCourse(collegeStudentCourse);
		
		mgr.registerCourseForWorkerOrPerson(personCourse);
		mgr.registerCourseForWorkerOrPerson(workerCourse);
		//mgr.registerCourseForWorkerOrPerson(collegeStudentCourse);
		
		mgr.registerCourseForStudent(studentCourse);
		mgr.registerCourseForStudent(collegeStudentCourse);
		//mgr.registerCourseForStudent(personCourse);
	}

}
