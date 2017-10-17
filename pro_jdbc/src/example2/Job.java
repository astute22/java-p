package example2;

public class Job {
	private String job_id;
	private String job_name;
	private int min_sal;
	private int max_sal;
	public Job() {
		// TODO Auto-generated constructor stub
	}
	public Job(String job_id, String job_name, int min_sal, int max_sal) {
		super();
		this.job_id = job_id;
		this.job_name = job_name;
		this.min_sal = min_sal;
		this.max_sal = max_sal;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public int getMin_sal() {
		return min_sal;
	}
	public void setMin_sal(int min_sal) {
		this.min_sal = min_sal;
	}
	public int getMax_sal() {
		return max_sal;
	}
	public void setMax_sal(int max_sal) {
		this.max_sal = max_sal;
	}
	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", job_name=" + job_name + ", min_sal=" + min_sal + ", max_sal=" + max_sal
				+ "]";
	}
	

}
