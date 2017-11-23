package practice;

import java.util.Comparator;

public class TestPriceComparator implements Comparator<TestEmp>{

	@Override
	public int compare(TestEmp e1, TestEmp e2) {	//no third variable(price) so compared with getId or 
													//else getPrice would've been used instead of getId
		if(e1.getId()>e2.getId()){
			return 1;
		}else if(e1.getId()<e2.getId()){
			return -1;
		}
		return 0;
	}

}
