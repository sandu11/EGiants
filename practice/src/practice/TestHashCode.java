package practice;

public class TestHashCode {
	public static void main(String[] args){

	TestEmp eq1=new TestEmp(101,"S");
	TestEmp eq2=new TestEmp(101,"S");
	
	System.out.println(eq1.hashCode());
	System.out.println(eq2.hashCode());
	
	String s1=new String("Hello");
	String s2=new String("Hello");
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	}
}
