import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String InsertQuery= "insert into emp.emp (empid, empname, empsal)"+ "values (10,'San',75000)"; //order by empid desc");

		try{
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "admin");
			
			Statement statement= connection.createStatement();	//used to execute the query
			
			int rows= statement.executeUpdate(InsertQuery);
			
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

}
