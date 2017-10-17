package example2;

import java.util.List;

public class JobApp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		JobDAO dao = new JobDAO();
		
		//잡ID로 검색후 출력
		//Job job1 = dao.findJob("IT_PROG");
		//System.out.println(job1);
		
		//모든 데이터 출력
		List<Job> jb = dao.allJob();
		for(Job j : jb)
			System.out.println(j.toString());	
	}
}
