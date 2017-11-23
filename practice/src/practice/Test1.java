package practice;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		
		
Test0 [] e= new Test0[10];
		
		e[0]= new Test0(1,"Emp1",100f);
		e[1]= new Test0(1,"Emp1",200f);
		
		if (e[0].equals(e[1]))
		{
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}






	
//	
//	ArrayList<Test0> e= new ArrayList<>();
//	e.add(1,"Emp1",100f);
//	e.add(1,"Emp1",100f);