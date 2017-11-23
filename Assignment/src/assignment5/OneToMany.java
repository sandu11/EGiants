package assignment5;

public class OneToMany {
	
	public static void main(String[] args)
	{
		
		empdetail ed=new empdetail(10, "HR");
		
		employee [] e= new employee[3];
		
		e[0]= new employee(10,"Ramesh","Consultant");
		e[1]= new employee(10,"Suresh","Consultant");
		e[2]= new employee(10,"Paresh","Consultant");
		
		ed.setempdept("Consultant");
	}

}
