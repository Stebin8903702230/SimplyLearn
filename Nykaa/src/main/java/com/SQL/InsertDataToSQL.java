package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDataToSQL {
	static String url = "jdbc:mysql://localhost:3306/Students";
	static String username = "root";
	static String password = "12345678";
	static String query;
	
	
	private static void insertData(int a, String b, String c, int d) throws SQLException {
		query = "insert into StudentInformation values ("+a+", '"+b+"' , '"+c+"', "+d+")";
		//To Connect the datatbase
		Connection connection = DriverManager.getConnection(url, username, password);
							
		//Create a Statement
		java.sql.Statement Statement = connection.createStatement();
			
		//Execute Query
		int executeUpdate = Statement.executeUpdate(query);
		System.out.println("Rows affected:"+executeUpdate);

		
		connection.close();
	}
	
	public static void main(String[] args) throws SQLException {
		insertData(1, "Mani", "Dora", 1230);

		
	}
}

	

