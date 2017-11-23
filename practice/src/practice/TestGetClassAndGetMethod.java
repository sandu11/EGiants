package practice;

import java.lang.reflect.Method;

public class TestGetClassAndGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestEmp eq1=new TestEmp(101,"S");
		
		System.out.println(eq1.getClass());	//used to display from which class it is taken
		
		Method[] methodarr= eq1.getClass().getMethods();
		System.out.println("Methods list: \n");
		
		for (Method method : methodarr) {
			System.out.println(method.getName());	//displays the list of methods available in the class
		}
	}

}
