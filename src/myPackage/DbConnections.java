package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DbConnections {
		@Test
		public void getBD() throws SQLException
			{
				//"jdbc:mysql://localhost:3306/QA_DB"
				//"jdbc:mysql://"+host+":"+port+"/databsename", "root"
				//host="localhost"
				//port="3306"
				//databasename="QA_DB
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/QA_DB", "root", "o7B21@0438");
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("Select * from EmployeeInfo where name ='VenkatRamana'");
				while(rs.next())
				{
					System.out.println(rs.getString("id"));
				}								
			}
		
		
}
