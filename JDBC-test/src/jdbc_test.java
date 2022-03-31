import java.sql.*;
public class jdbc_test {
public static void main(String[] args) throws SQLException {
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRS = null;
	try {
		// 1. Get a connection to database
		myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","student","student");
		System.out.println("Database connection successsful!\n");
		// 2. Create a statement
		myStmt = myConn.createStatement();
		// 3. Execute SQL query
		myRS = myStmt.executeQuery("select * from employees");
		// 4. Process the result set
		while(myRS.next()) {
		System.out.println(myRS.getString("last_name")+","+ myRS.getString("first_name"));
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(myRS != null) {
			myRS.close();
		}
		if(myStmt != null) {
			myStmt.close();
		}
		if(myConn != null) {
			myConn.close();
		}
	}
	
	}
}
