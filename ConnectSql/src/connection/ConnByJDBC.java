package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnByJDBC {
	Connection conn;
	public void method() {
		  try {
		         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		      } catch (ClassNotFoundException e) {
		         e.printStackTrace();
		      }
		       String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";
		       try {
		         conn=DriverManager.getConnection(dbURL,"sa","Abcd1234");
		         System.out.println("Connection Successful!");
		       } catch (SQLException e) {
		         e.printStackTrace();
		      }
	}
	
	public void insertData() {
		Statement statement;
		ResultSet rs;
		String query = "select Name, ID from dbo.Table_1"; 
		try {
			method();
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()) {
				String aaa = rs.getString("Name");
				String bbb = rs.getString("ID");
				System.out.println("Name: "+ aaa + "ID: " + bbb);
			}
			statement.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
