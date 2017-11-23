package practice;

public class TestEmp implements Comparable<TestEmp>{
	
	private int id;
	private String name;
	public TestEmp(int id,String name) {
		
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(TestEmp e) {

		if(this.id>e.id){
			return 1;
		}else if(this.id<e.id)
		{
			return -1;
		}else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		
		TestEmp eq2= (TestEmp)obj;
		
		if(eq2 != null){
			if((this.id==eq2.id)&&this.name.equals(eq2.name)){
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		
		return "ID: " +id+"\nName: " +name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
