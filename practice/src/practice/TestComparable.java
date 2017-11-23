package practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {				//compare by ID

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<TestEmp> e=new ArrayList<>();
		
		e.add(new TestEmp(201, "D"));
		e.add(new TestEmp(202, "AK"));
		e.add(new TestEmp(204, "SK"));
		e.add(new TestEmp(203, "V"));
		
		//Collections.sort(e);									//for comparable
		Collections.sort(e,new TestNameComparator());			//for comparator
		
		for (TestEmp testEq : e) {
			System.out.println(testEq.getId());
			System.out.println(testEq.getName()+"\n");
		}
	}

}
