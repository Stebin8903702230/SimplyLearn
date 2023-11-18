package com.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {

			static String url = "jdbc:mysql://localhost:3306/students";
			static String username = "root";
			static String password = "12345678";
			static String query = "select * from StudentInformation";
			
			
			private static void getAData() throws SQLException {
				
				//To Connect the datatbase
				Connection connection = DriverManager.getConnection(url, username, password);
									
				//Create a Statement
				java.sql.Statement createStatement = connection.createStatement();
					
				//Execute Query
				ResultSet executeQuery = createStatement.executeQuery(query);
				
				while (executeQuery.next()) {
					
					System.out.print(executeQuery.getInt(1));					System.out.print("\t");
					System.out.print(executeQuery.getString(2));				System.out.print("\t");
					System.out.print(executeQuery.getString(3));				System.out.print("\t");
					System.out.print(executeQuery.getString(4));				System.out.println();
				}
				connection.close();
			}
			
			public static void main(String[] args) throws SQLException {
				getAData();
			}
}
