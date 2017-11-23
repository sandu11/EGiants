package assignment5;

public class employee {

	private int empid;
	private String empname;
	private String empjob;
	
	empdetail ed;
	
	 public employee() {
		
		 
	}
	public employee(int empid, String empname, String empjob) {
		
		this.empid = empid;
		this.empname = empname;
		this.empjob = empjob;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getempname() {
		return empname;
	}
	public void setempname(String empname) {
		this.empname = empname;
	}
	public String getempjob() {
		return empjob;
	}
	public void setempjob(String empjob) {
		this.empjob = empjob;
	}
	 
}