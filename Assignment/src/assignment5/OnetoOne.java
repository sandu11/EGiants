package assignment5;
 
public class OnetoOne {

	public static void main(String args[])
	{
		employee e=new employee(001,"Sandeep","SE");
		empdetail emp=new empdetail(001,"HR");
		
		emp.emp0=e; //association concept- 
		
		System.out.println("Name of the employee:  " +emp.emp0.getempname());
		System.out.println("EMployee department:  " +emp.getempdept());
		
	}

	 
}
