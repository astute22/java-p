package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Registration;

public class RegistrationDAO {

	//지정된 학생의 수강신청정보 조회
	@SuppressWarnings("unchecked")
	public List<Registration> getRegistrationByStudent(int studno) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("registration.getRegistrationByStudent", studno);
	}
	
	//지정된 과정의 수강신청정보 조회
	@SuppressWarnings("unchecked")
	public List<Registration> getRegistrationByCourse(int courseNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("registration.getRegistrationByCourse", courseNo);
	}
	
	//수강신청정보 저장
	public void addRegistration(Registration registration) throws SQLException{
		IbatisUtils.getSqlMapClient().insert("registration.addRegistration", registration);
	}
	
	//수강정보 삭제
	public void cancelCourse(int studNo) throws SQLException{
		IbatisUtils.getSqlMapClient().delete("registration.cancelCourse", studNo);
	}
}