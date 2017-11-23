package practice;

public class TestToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestEmp eq1=new TestEmp(101,"S");
		TestEmp eq2=new TestEmp(101,"S");
		
		System.out.println(eq1);
		System.out.println(eq2.toString());
		
		String s1= new String("\nHello");
		
		System.out.println(s1.toString());
	}

}
