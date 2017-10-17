package example3;

public class HumanResource {
	private int year;
	private String organization;
	private String department;
	private String position;
	private int positioncount;
	private int plannedpositioncount;
	public HumanResource() {
		// TODO Auto-generated constructor stub
	}
	public HumanResource(int year, String organization, String department, String position, int positioncount,
			int plannedpositioncount) {
		super();
		this.year = year;
		this.organization = organization;
		this.department = department;
		this.position = position;
		this.positioncount = positioncount;
		this.plannedpositioncount = plannedpositioncount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPositioncount() {
		return positioncount;
	}
	public void setPositioncount(int positioncount) {
		this.positioncount = positioncount;
	}
	public int getPlannedpositioncount() {
		return plannedpositioncount;
	}
	public void setPlannedpositioncount(int plannedpositioncount) {
		this.plannedpositioncount = plannedpositioncount;
	}
	@Override
	public String toString() {
		return "HumanResource [year=" + year + ", organization=" + organization + ", department=" + department
				+ ", position=" + position + ", positioncount=" + positioncount + ", plannedpositioncount="
				+ plannedpositioncount + "]";
	}
	
}
