package example3;

import java.util.Date;

public class Employee {
	private int empId;
	private String fName;
	private String lName;
	private String email;
	private String ph;
	private Date hireDate;
	private String jobId;
	private double salary;
	private double comPct;
	private int mgrId;
	private int depId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getComPct() {
		return comPct;
	}
	public void setComPct(double comPct) {
		this.comPct = comPct;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", ph=" + ph
				+ ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + ", comPct=" + comPct
				+ ", mgrId=" + mgrId + ", depId=" + depId + "]";
	}
}
