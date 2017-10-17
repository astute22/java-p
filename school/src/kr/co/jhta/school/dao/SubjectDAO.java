package kr.co.jhta.school.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.jhta.school.util.IbatisUtils;
import kr.co.jhta.school.vo.Subject;

public class SubjectDAO {

	//모든 정보과목 조회
	@SuppressWarnings("unchecked")
	public List<Subject> getAllSubjects() throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("subject.getAllSubjects");
	}
	
	//지정된 부서번호에 해당하는 학과의 과목정보 조회
	@SuppressWarnings("unchecked")
	public List<Subject> getSubjectsByDept(int deptNo) throws SQLException{
		return IbatisUtils.getSqlMapClient().queryForList("subject.getSubjectsByDept", deptNo);
	}
	
	//지정된 과목번호에 해당하는 과목정보 조회
	public Subject getSubjectByNo(int subjectNo) throws SQLException{
		return (Subject) IbatisUtils.getSqlMapClient().queryForList("subject.getSubjectByNo", subjectNo);
	}
}
