import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMultiple{
	
	public static void addemp(TestEmpDetails testEmpDetails)
	{

	String InsertQuery= "insert into emp.emp (empid, empname, empsal)" + "values (?,?,?)"; 

	try{
		//1
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "admin");
		
		//2
		PreparedStatement preparedStatement= connection.prepareStatement(InsertQuery);	//used to execute the query
		
		preparedStatement.setInt(1,testEmpDetails.getId());
		preparedStatement.setString(2, testEmpDetails.getName());
		preparedStatement.setFloat(3, testEmpDetails.getSal());

		//3
		int rows= preparedStatement.executeUpdate();
		
		if(rows==1){
			System.out.println("Record added successfully");
		}
				
	connection.close();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
	public static void getEmp(){
		
		String selectQuery= "select * from emp.emp order by empname desc";
		
		try {
			
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "admin");
			
			Statement statement= connection.createStatement();
			
			ResultSet resultSet= statement.executeQuery(selectQuery);
			
			while(resultSet.next()){
				System.out.println("Emp Id: "+resultSet.getInt("empid"));
				System.out.println("Emp Name: "+resultSet.getString("empname"));
				System.out.println("Emp Salary: "+resultSet.getFloat("empsal"));
				System.out.println();
			}
			
			resultSet.close();
			
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addemp(10, "San", 75000.00f);
		
//		TestEmpDetails testEmpDetails =new TestEmpDetails(20,"Deep",80000.00f);
//		
//		addemp(testEmpDetails);
//		
		getEmp();
	}

}
