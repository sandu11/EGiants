package assignment5;

public class empdetail {
	private int empid;
	private String empdept;
	
	employee emp0;
	
	public empdetail(int empid, String empdept) {
		super();
		this.empid = empid;
		this.empdept = empdept;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = empid;
	}
	public String getempdept() {
		return empdept;
	}
	public void setempdept(String empdept) {
		this.empdept = empdept;
	}
	
}
