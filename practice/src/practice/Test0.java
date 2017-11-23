package practice;

class Test0{
	int empid;
	String empname;
	float salary;
	
public Test0(int empid, String empname, float salary) {
		
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
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
	public float salary() {
		return salary;
	}
	public void salary(float salary) {
		this.salary = salary;
	}
}