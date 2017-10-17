package example2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {
	//New Job Save
	public void addJob(Job job) throws Exception{
		
	}
	//job_id에 해당하는 job정보 삭제
	public void removeJob(String job_id)throws Exception{
		
	}
	//job_id에 해당하는 job정보 조회해서 반환
	public Job findJob(String job_id)throws Exception{
		Job job = null;
		StringBuilder sb = new StringBuilder();
		sb.append("select job_id, job_title, min_salary, max_salary ");
		sb.append("from jobs ");
		sb.append("where job_id = '" + job_id + "'");
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sb.toString());
		while(rs.next()){
			job = new Job();
			job.setJob_id(rs.getString("job_id"));
			job.setJob_name(rs.getString("job_title"));
			job.setMin_sal(rs.getInt("min_salary"));
			job.setMax_sal(rs.getInt("max_salary"));
		}
		rs.close();
		stmt.close();
		con.close();
		return job;
	}
	//모든 job정보 조회해서 반환
	public List<Job> allJob()throws Exception{
		List<Job> jb = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("select job_id, job_title, min_salary, max_salary ");
		sb.append("from jobs ");
		sb.append("order by job_id asc");
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "zxcv1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sb.toString());
		
		while(rs.next()){
			Job job = new Job();
			job.setJob_id(rs.getString("job_id"));
			job.setJob_name(rs.getString("job_title"));
			job.setMin_sal(rs.getInt("min_salary"));
			job.setMax_sal(rs.getInt("max_salary"));
			jb.add(job);
		}
		
		rs.close();
		stmt.close();
		con.close();
		return jb;
	}

}
