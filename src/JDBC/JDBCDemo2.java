package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCDemo2 {

	public static void main(String[] args) {
		// create a free account at db4free.net to follow the tutorial below
		String dbURL = "jdbc:mysql://db4free.net:3306/sriautomationdb";// with database name to access tables 
		String dbURL2 = "jdbc:mysql://db4free.net:3306/"; // without database name to create new database
		String username ="skilvidi";
		String password = "passw0rd1";
		Connection dbCon = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		String Query1="CREATE TABLE pet (name VARCHAR(20), owner VARCHAR(20),species VARCHAR(20), sex CHAR(1), birth DATE, death DATE)";
		
	/*	String Query2="LOAD DATA LOCAL INFILE 'C:/Users/srida/Documents/Sri_1stJavaProject/JavaFundmentals/src/JDBC/pet.txt' INTO TABLE pet\r\n" + 
				"LINES TERMINATED BY '\\r\\n';";*/
		
		String Query2="LOAD DATA LOCAL INFILE 'C:/Users/srida/Documents/Sri_1stJavaProject/JavaFundmentals/src/JDBC/pet.txt' INTO TABLE pet";
		
		String Query3 = "SELECT * FROM pet";
		
		String Query4 ="INSERT INTO pet VALUES ('Puffball','Diane','hamster','f','1999-03-30',NULL)";
		
		String dbName = "STUDENTS";
		
		String sql = "CREATE DATABASE pets";
		
		
		   
		try { 
			//Open database connection to MySQL server
			System.out.println("Connecting to database...");
		 	dbCon = DriverManager.getConnection(dbURL, username, password);
		 	//getting PreparedStatment to execute query
		 	
		 	//stmt=dbCon.prepareStatement(Query1);
		 	//stmt.execute(Query1);
		 	
		 	stmt=dbCon.prepareStatement(Query4);
		 	stmt.executeUpdate(Query4);
		 	 	
			stmt = dbCon.prepareStatement(Query3);
			//Resultset returned by query
			rs = stmt.executeQuery(Query3);
		
			while(rs.next()){
				
				String name=rs.getString("name");
				String ad=rs.getString("owner");
				String pm=rs.getString("species");
				
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
