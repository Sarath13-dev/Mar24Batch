package org.logout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//launch the url
		//DriverManager - pre defined class getConnection - static method
		//Database - localmachine - host - localhost
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "10Aero50!");
		//Write the Query
		String s = "Select * from Employees";
		//Query - String - Database (Java String - Statement)
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		//Execute Query
		ResultSet executeQuery = prepareStatement.executeQuery();
		//Table - Java Representation - ResultSet
		//Table - Iterate the table and print
		while(executeQuery.next()) {
			String string = executeQuery.getString("first_name");
			System.out.println(string);
		}
	connection.close();
	
	}

}
