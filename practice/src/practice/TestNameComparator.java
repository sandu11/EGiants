package practice;

import java.util.Comparator;

public class TestNameComparator implements Comparator<TestEmp>{
	
	@Override
	public int compare(TestEmp e1, TestEmp e2) {
			return e1.getName().compareTo(e2.getName());
		}

}
