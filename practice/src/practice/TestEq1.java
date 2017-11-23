package practice;

public class TestEq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEmp eq1=new TestEmp(101,"S");
		TestEmp eq2=new TestEmp(101,"S");
		
		System.out.println(eq1==eq2);
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(eq1.equals(eq2));
		
		
		
	}

}
