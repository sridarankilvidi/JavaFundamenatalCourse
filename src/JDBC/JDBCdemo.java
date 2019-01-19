package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCdemo {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://db4free.net:3306/sriautomationdb";
		String username ="skilvidi";
		String password = "passw0rd1";
		Connection dbCon = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String query ="select count(*) from Student";//executeQuery
		String queryA ="select Name,Address,Program from Student";//executeQuery
		
		String query2 = "insert into Student values('janani','85 roosevelt','analyst')";//executeUpdate
		String query3 = "update Student set Address='85 rue roosevelt,ddo' where Name='janani'";//executeUpdate
		String query4 = "delete FROM Student where Name='janani'";//executeUpdate
		
		try { //getting database connection to MySQL server
		 	dbCon = DriverManager.getConnection(dbURL, username, password);
		 	//getting PreparedStatment to execute query
		 	
		 	stmt=dbCon.prepareStatement(query2);
		 	stmt.executeUpdate(query2);
		 	 	
			stmt = dbCon.prepareStatement(queryA);
			//Resultset returned by query
			rs = stmt.executeQuery(queryA);
		
			while(rs.next()){
				
				String name=rs.getString("Name");
				String ad=rs.getString("Address");
				String pm=rs.getString("Program");
				
				System.out.println(name+"    "+ad+"    "+pm);
			}
				
			dbCon.close();
			}
		 catch (SQLException ex) {
			 Logger.getLogger(Collections.class.getName()).log(Level.SEVERE, null, ex); 
			} finally{ //close connection ,stmt and resultset here }
				
			} 


	}

}
